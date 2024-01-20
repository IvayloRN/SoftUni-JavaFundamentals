package javaFundamentals.week2;

import java.util.Scanner;

public class U07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        int quantityWaterToTheTank = 0;
        for (int i = 0; i < n; i++) {
            int littersOfWater = Integer.parseInt(scanner.nextLine());
            if (tankCapacity - littersOfWater >= 0) {
                tankCapacity -= littersOfWater;
                quantityWaterToTheTank += littersOfWater;
            } else {
                System.out.println("Insufficient capacity!");

            }

        }
        System.out.println(quantityWaterToTheTank);
    }
}
//Резервоар капацитет - 255 литра
// Ако капацитета на резервоара не е достатъчно да събере водата print "Insufficient capacity!