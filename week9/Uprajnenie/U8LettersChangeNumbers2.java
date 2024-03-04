package javaFundamentals.week9.Uprajnenie;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U8LettersChangeNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] codes = scanner.nextLine().split("\\s+");
        double totalAmount = 0;

        for (String code: codes) {

            char firstLetter = code.charAt(0);
            char secondLetter = code.charAt(code.length() - 1);
            double currentNum = Double.parseDouble(code.replace(firstLetter, ' ')
                    .replace(secondLetter, ' ')
                    .trim());


            totalAmount += currentNum(firstLetter,secondLetter,currentNum);
        }
        System.out.printf("%.2f",totalAmount);



    }
    public static Double currentNum (char firstLetter, char secondLetter , double currentNum){
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
        return currentNum;

    }

}

//ASCII-40    -96
