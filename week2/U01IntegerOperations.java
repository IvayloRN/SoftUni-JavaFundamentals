package javaFundamentals.week2;

import java.util.Scanner;

public class U01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());
        int result = ((n1 + n2) / n3) * n4;

        System.out.println(result);

    }
}
//Add the first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number