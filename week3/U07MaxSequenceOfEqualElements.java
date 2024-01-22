package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int streak = 1;
        int maxStreak = 0;
        int charOfStreak = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == myArray[i-1]){
                streak++;


            }else {
                streak = 1;
            }
            if (streak > maxStreak){
                maxStreak = streak;
                charOfStreak = myArray[i];
            }
        }
        int[] finalArray = new int[maxStreak];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = charOfStreak;
        }
        for (int finalArr : finalArray) {
            System.out.print(finalArr + " ");
        }
    }
}
