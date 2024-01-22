package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index < input.length; index++) {
            int leftSideSum = 0;
            int rightSideSum = 0;
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSideSum += input[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < input.length; rightIndex++) {
                rightSideSum += input[rightIndex];
            }
            if (leftSideSum == rightSideSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
