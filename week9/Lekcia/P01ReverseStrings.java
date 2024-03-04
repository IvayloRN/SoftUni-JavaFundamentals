package javaFundamentals.week9.Lekcia;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input  = scanner.nextLine();
        String newWord = "";
        while (!input.equals("end")) {
            for (int i = input.length() - 1; i >= 0; i--) {
                newWord += input.charAt(i);
            }
            System.out.println(String.join(" = ", input , newWord));
            input = scanner.nextLine();
            newWord = "";
        }
    }
}
