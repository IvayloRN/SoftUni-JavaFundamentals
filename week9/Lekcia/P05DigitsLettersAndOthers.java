package javaFundamentals.week9.Lekcia;

import java.util.Scanner;

public class P05DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isAlphabetic(ch)){
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);

            }else{
                others.append(ch);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());

    }
}
