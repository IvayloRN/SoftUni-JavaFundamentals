package javaFundamentals.week10.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ValidPassword2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([_][.]+)(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])([_][.]+)");

        for (int numberOfPasswords = 0; numberOfPasswords < n; numberOfPasswords++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String pass = matcher.group("pass");
                String passNumber = "";
                int numCounter = 0;
                for (int i = 0; i < pass.length(); i++) {
                    char symb = pass.charAt(i);
                    if (Character.isDigit(symb)){
                        passNumber += symb;
                        numCounter++;
                    }
                }
                if (numCounter > 0) {
                    System.out.printf("Group: %s\n", passNumber);
                }else {
                    System.out.println("Group: default");
                }
            }else{
                System.out.println("Invalid pass!");
            }
        }
    }
}