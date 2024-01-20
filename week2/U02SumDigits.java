package javaFundamentals.week2;

import java.util.Scanner;

public class U02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n > 0){
            int num = n % 10;
            n = n / 10;
            sum+=num;
        }

        System.out.println(sum);

    }
}
