package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream((scanner.nextLine())
                        .split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotations; i++) {
            int firstDigit = numbers[0];

            for (int index = 0; index < numbers.length -1; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length -1] = firstDigit;
        }
        for (int element: numbers) {


            System.out.print(element + " ");
        }
    }
}