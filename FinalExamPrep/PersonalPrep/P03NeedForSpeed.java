package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileage = new LinkedHashMap<>();
        Map<String, Integer> carFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] myArray = input.split("\\|");
            String car = myArray[0];
            int mileage = Integer.parseInt(myArray[1]);
            int fuel = Integer.parseInt(myArray[2]);
            carMileage.put(car,mileage);
            carFuel.put(car,fuel);
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")){
            String[] myArray = commands.split(" : ");
            String command = myArray[0];
            String car = myArray[1];

            switch (command){
                case "Drive":
                    int fuelRequired = Integer.parseInt(myArray[3]);
                    int distance = Integer.parseInt(myArray[2]);
                    int carFuelAvailable = carFuel.get(car);
                    if (carFuelAvailable >= fuelRequired){
                        int tempMileage = carMileage.get(car) + distance;
                        int tempFuel = carFuel.get(car) - fuelRequired;
                        carFuel.put(car,tempFuel);
                        carMileage.put(car,tempMileage);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",car, distance, fuelRequired);
                        if (tempMileage >= 100000){
                            System.out.printf("Time to sell the %s!\n",car);
                            carMileage.remove(car);
                            carFuel.remove(car);
                        }
                    }else{
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int fuel = Integer.parseInt(myArray[2]);
                    int fuelInTheTank = carFuel.get(car);
                    if (fuelInTheTank >= 75){
                        System.out.printf("%s refueled with 0 liters\n",car);
                    }else{
                        int fuelToRefill = fuelInTheTank + fuel;
                        if (fuelToRefill > 75){
                            fuelToRefill = 75;
                            carFuel.put(car,fuelToRefill);
                            int fuelDiff = fuelInTheTank + fuel - 75;
                            int fuelNeeded = fuel - fuelDiff;
                            System.out.printf("%s refueled with %d liters\n", car, fuelNeeded);

                        }else{
                            System.out.printf("%s refueled with %d liters\n", car, fuel);
                            carFuel.put(car, fuelToRefill);
                        }
                    }

                    break;
                case "Revert":
                    int kilometersToDecrease = Integer.parseInt(myArray[2]);
                    int momentusKilometers = carMileage.get(car);
                    int decreasedKilometers = momentusKilometers - kilometersToDecrease;
                    if (decreasedKilometers < 10000){
                        decreasedKilometers = 10000;
                        carMileage.put(car,decreasedKilometers);
                    }else {
                        carMileage.put(car, decreasedKilometers);
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometersToDecrease);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }

        carMileage.entrySet().forEach(e->{
            String car = e.getKey();
            int mileage = e.getValue();
            int fuel = carFuel.get(car);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",car, mileage, fuel);
        });

    }
}
