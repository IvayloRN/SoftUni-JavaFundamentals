package javaFundamentals.week4;

import java.util.Scanner;

public class U08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double result = fact1(n1) * 1.0 / fact1(n2);
        System.out.printf("%.2f",result);

    }
    public static long fact1 (int n1){
        long fact =1;
        for (int i = 1; i <= n1; i++) {
            fact *= i;
        }

        return fact;
    }

}
