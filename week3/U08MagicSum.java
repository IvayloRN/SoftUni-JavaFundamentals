package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());
        for (int multiplier = 0; multiplier < input.length; multiplier++) {
            for (int secondMultiplier = multiplier+1; secondMultiplier < input.length; secondMultiplier++) {
                if(input[multiplier] + input[secondMultiplier] == magicNumber){
                    System.out.printf("%d %d\n",input[multiplier],input[secondMultiplier]);
                }

            }

        }



    }
}
