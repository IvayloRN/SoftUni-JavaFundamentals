package javaFundamentals.week4;

import java.util.Scanner;

public class U10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);

    }
    public static void topNumber (int n) {
        boolean odd = false;
        int sumOfDigits = 0;
        for (int num = 10; num < n; num++) {
            int number = num;
            while (number > 0){
                int lastDig = number % 10;
                if (lastDig % 2 != 0){
                    odd = true;
                }
                sumOfDigits += lastDig;
                number /= 10;
            }
            if (sumOfDigits % 8 == 0 && odd){
                System.out.println(num);
            }
            sumOfDigits = 0;
            odd = false;
        }
    }


}
//•	Its sum of digits is divisible by 8,
//•	Holds at least one odd digit,