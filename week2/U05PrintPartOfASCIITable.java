package javaFundamentals.week2;

import java.util.Scanner;

public class U05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymb = Integer.parseInt(scanner.nextLine());
        int lastSymb = Integer.parseInt(scanner.nextLine());
        for (int i = firstSymb; i <= lastSymb; i++) {
            char a = ((char)i);
            System.out.print(a + " ");
        }

    }
}
