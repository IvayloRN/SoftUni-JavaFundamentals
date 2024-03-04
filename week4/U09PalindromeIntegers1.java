package javaFundamentals.week4;

import java.util.Scanner;

public class U09PalindromeIntegers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            palindromeCheck(input);



            input = scanner.nextLine();
        }

    }
    public static void palindromeCheck (String input){

        String leftPart = "";
        String rightPart = "";
        if (input.length() % 2 == 0){
            for (int i = 0; i <= input.length() / 2 -1; i++) {
                char left = input.charAt(i);
                leftPart+=left;
            }
            for (int i = input.length() -1; i >= input.length()  / 2; i--) {
                char right = input.charAt(i);
                rightPart += right;
            }
            if (leftPart.equals(rightPart)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else {
            for (int i = 0; i < input.length() / 2; i++) {
                char left = input.charAt(i);
                leftPart += left;
            }
            for (int i = input.length() - 1; i > input.length() / 2; i--) {
                char right = input.charAt(i);
                rightPart += right;
            }
            if (leftPart.equals(rightPart)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }


    }


}
