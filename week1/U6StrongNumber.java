package javaFundamentals.week1;

import java.util.Scanner;

public class U6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        int finalNumber = 0;

        String textFromNumbers = String.valueOf(number);
        for (int position = textFromNumbers.length() - 1; position >= 0; position--) {

            char currentSymbol = textFromNumbers.charAt(position);
            String abc = String.valueOf(currentSymbol);
            int nextNumber = Integer.parseInt((abc));
            currentNumber = nextNumber;

            for (int i = 1 ; i <= currentNumber-1; i++) {
                nextNumber *= i;

            }
            finalNumber+=nextNumber;
        }
        // System.out.println(finalNumber);
        if (finalNumber == number){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
