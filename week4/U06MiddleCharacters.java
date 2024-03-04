package javaFundamentals.week4;

import java.util.Scanner;

public class U06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleChar(input);


    }
    public static void middleChar (String input){
        if (input.length() % 2 == 0){
            int symbPosition1 = input.length() / 2 -1;
            int symbPosition2 = input.length() / 2;
            System.out.printf("%c%c",(input.charAt(symbPosition1)),input.charAt(symbPosition2));
        }else {
            int symbPositionOdd = input.length() /2;
            System.out.println(input.charAt(symbPositionOdd));

        }


    }

}
