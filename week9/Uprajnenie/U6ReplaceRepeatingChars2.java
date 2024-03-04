package javaFundamentals.week9.Uprajnenie;

import java.util.Scanner;

public class U6ReplaceRepeatingChars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);
        for (int i = 0; i < builder.length() -1; i++) {
            if (builder.charAt(i) == builder.charAt(i +1)){
                builder.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(builder);
    }
}
