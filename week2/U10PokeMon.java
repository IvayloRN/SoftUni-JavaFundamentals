package javaFundamentals.week2;

import java.util.Scanner;

public class U10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int pokedTargets = 0;
        int startingPower = powerN;
        while (powerN >= distanceM){
            powerN -= distanceM;
            pokedTargets++;
            if (startingPower / 2 == powerN){
                if (exhaustionFactorY != 0) {

                    powerN = powerN / exhaustionFactorY;
                }
            }
        }
        System.out.println(powerN);
        System.out.println(pokedTargets);

    }
}