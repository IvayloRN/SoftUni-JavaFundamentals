package javaFundamentals.week4;

import java.util.Scanner;

public class U05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(n1 , n2) - subtract(n3));

    }
    public static int sum (int n1 , int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static int subtract ( int n3){
        return n3;
    }

}
