package javaFundamentals.week2;

import java.util.Scanner;

public class U04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int result = 0;
        for (int i = 1; i <= n; i++) {
            char randomLetter = scanner.nextLine().charAt(0);
            int num = ((int)randomLetter);
            result += num;

        }
        System.out.printf("The sum equals: %d",result);

    }
}
