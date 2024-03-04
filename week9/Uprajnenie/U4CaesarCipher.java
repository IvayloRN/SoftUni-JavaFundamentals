package javaFundamentals.week9.Uprajnenie;

import java.util.Scanner;

public class U4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String cryptedText = "";

        for (int i = 0; i < input.length(); i++) {
            char symb = (char) (input.charAt(i) + 3);
            cryptedText += symb;

        }

        System.out.println(cryptedText);
    }
}
