package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U05TopIntegers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index < input.length; index++) {
            boolean isTop = true;
            for (int i = index + 1; i < input.length; i++) {
                if (input[index] <= input[i]){
                    isTop = false;
                    break;
                }
            }

            if (isTop){
                System.out.print(input[index] + " ");
            }
        }


    }
}
