package javaFundamentals.week2;

import java.util.Scanner;

public class U03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int courses = persons / elevatorCapacity;
        if (persons % elevatorCapacity != 0){
            courses ++;
        }
        System.out.println(courses);
    }
}