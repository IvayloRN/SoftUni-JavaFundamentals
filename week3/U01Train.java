package javaFundamentals.week3;

import java.util.Scanner;

public class U01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int peopleCount = 0;
        int[] passengers = new int[countOfWagons];
        for (int i = 1; i <= countOfWagons; i++) {
            int amountOfPeople = Integer.parseInt(scanner.nextLine());
            peopleCount += amountOfPeople;
            passengers[i -1] = amountOfPeople;
        }
        for (int print: passengers) {
            System.out.print(print + " ");
        }
        System.out.println();
        System.out.println(peopleCount);

    }
}
