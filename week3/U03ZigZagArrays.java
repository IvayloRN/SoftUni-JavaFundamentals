package javaFundamentals.week3;

import java.util.Scanner;

public class U03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[rows];
        int[] secondArray = new int[rows];
        for (int row = 1; row <= rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            if (row % 2 == 0){
                firstArray[row - 1] = num2;
                secondArray[row - 1] = num1;
            }else{
                firstArray[row -1 ] = num1;
                secondArray[row -1 ] = num2;
            }

        }
        for (int in1 : firstArray) {
            System.out.print(in1 + " ");
        }
        System.out.println("");
        for (int in2 : secondArray) {
            System.out.print(in2 + " ");
        }

    }
}
