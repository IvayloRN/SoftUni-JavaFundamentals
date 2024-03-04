package javaFundamentals.week9.Uprajnenie;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U8LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] codes = scanner.nextLine().split("\\s+");
        double totalAmount = 0;

        for (String code: codes) {
            double currentNum = currentNum(code);
            char firstLetter = code.charAt(0);
            char secondLetter = code.charAt(code.length() - 1);
            if (Character.isLowerCase(firstLetter)){
                int letterPosition = firstLetter - 96;
                currentNum = currentNum * letterPosition;

            }else {
                int letterPosition = firstLetter - 64;
                currentNum = currentNum / letterPosition;

            }
            if (Character.isLowerCase(secondLetter)){
                int letterPosition = secondLetter - 96;
                currentNum = currentNum + letterPosition;

            }else{
                int letterPosition = secondLetter - 64;
                currentNum = currentNum - letterPosition;

            }
            totalAmount += currentNum;
        }
        System.out.printf("%.2f",totalAmount);
    }
    private static int currentNum(String code) {
        String num = "";
        for (int position = 1; position < code.length() - 1; position++) {
            char symb = code.charAt(position);
            num += symb;
        }
        return Integer.parseInt(num);
    }
}

//ASCII-40    -96
