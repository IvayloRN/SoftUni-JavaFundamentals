package javaFundamentals.week7.U05VehicleCatalogue;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<VehicleCatalogue> catalogueList = new ArrayList<>();
        String typeOfVehicle = null;
        String model = null;
        String color = null;
        int horsePower = 0;
        double carHorsePowerTotal = 0;
        int carHorseCounter = 0;
        int truckHorseCounter = 0;
        double truckHorsePowerTotal = 0;
        VehicleCatalogue vehicleCatalogue = new VehicleCatalogue(typeOfVehicle , model , color , horsePower);
        while (!input.equals("End")){
            String[] myArray = input.split(" ");
            model = myArray[1];
            color = myArray[2];
            horsePower = Integer.parseInt(myArray[3]);
            typeOfVehicle = myArray[0];
            if (typeOfVehicle.equals("car")) {
                typeOfVehicle = "Car";
                carHorsePowerTotal+= horsePower;
                carHorseCounter++;
            }else{
                typeOfVehicle = "Truck";
                truckHorsePowerTotal+= horsePower;
                truckHorseCounter++;
            }
            vehicleCatalogue = new VehicleCatalogue(typeOfVehicle , model , color , horsePower);
            catalogueList.add(vehicleCatalogue);

            input = scanner.nextLine();
        }

        String desiredInfo = scanner.nextLine();
        while (!desiredInfo.equals("Close the Catalogue")){
            for (VehicleCatalogue catalogue: catalogueList) {

                if (catalogue.getModel().contains(desiredInfo)) {
                    System.out.println("Type: "+ catalogue.getTypeOfVehicle());
                    System.out.println("Model: "+ catalogue.getModel());
                    System.out.println("Color: "+ catalogue.getColor());
                    System.out.println("Horsepower: "+ catalogue.getHorsePower());
                }
            }


            desiredInfo = scanner.nextLine();
        }

        if (carHorseCounter == 0 ){
            System.out.println("Cars have average horsepower of: 0.00.");
        }else {
            double totalCarHorsePower = carHorsePowerTotal / carHorseCounter;
            System.out.printf("Cars have average horsepower of: %.2f.\n", totalCarHorsePower);
        }
        if (truckHorseCounter == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }else {
            double totalTruckHorsePower = truckHorsePowerTotal / truckHorseCounter;

            System.out.printf("Trucks have average horsepower of: %.2f.", totalTruckHorsePower);
        }
    }
}
