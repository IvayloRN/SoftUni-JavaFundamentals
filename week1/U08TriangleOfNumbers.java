package javaFundamentals.week1;

import java.util.Scanner;

public class U08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {

            for (int num = 1; num <= rows; num++) {
                System.out.print(rows + " ");
            }
            System.out.println("");

        }

    }
}
