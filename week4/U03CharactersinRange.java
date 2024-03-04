package javaFundamentals.week4;

import java.util.Scanner;

public class U03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printChars(firstChar, secondChar);

    }

    public static void printChars(char c1, char c2) {
        if (c1 <= c2) {
            for (char i = (char) (c1 + 1); i < c2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (c2 + 1); i < c1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}