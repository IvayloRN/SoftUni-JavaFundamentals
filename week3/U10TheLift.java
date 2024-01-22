package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U10TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaitingForLift = Integer.parseInt(scanner.nextLine());
        int[] wagonsAvailability = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int onTheLiftPeople = 0;
        int maxTourists = wagonsAvailability.length * 4;
        for (int i = 0; i < wagonsAvailability.length; i++) {
            int touristsCount = 0;
            touristsCount += wagonsAvailability[i];
            maxTourists = maxTourists - touristsCount;
        }
        for (int i = 0; i < wagonsAvailability.length; i++) {
            if (wagonsAvailability[i] == 4){
                continue;
            }


            for (int j = 1; j <= peopleWaitingForLift; j++) {
                wagonsAvailability[i]++;
                onTheLiftPeople++;
                if (onTheLiftPeople == peopleWaitingForLift){
                    if (peopleWaitingForLift != maxTourists) {
                        System.out.println("The lift has empty spots!");
                        for (int wagons : wagonsAvailability) {
                            System.out.print(wagons + " ");
                        }
                        return;
                    }
                }
                if (wagonsAvailability[i] >= 4){
                    break;
                }


            }
        }
        if (peopleWaitingForLift > onTheLiftPeople){
            System.out.printf("There isn't enough space! %d people in a queue!\n",peopleWaitingForLift - onTheLiftPeople);
            for (int wagons: wagonsAvailability) {
                System.out.print(wagons + " ");
            }
        }else{
            for (int wagons: wagonsAvailability) {
                System.out.print(wagons + " ");
            }
        }
    }
}