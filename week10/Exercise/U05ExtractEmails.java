package javaFundamentals.week10.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U05ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = " (?<email>([A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+?)@[A-Za-z]+[A-Za-z]+[\\-]?[A-Za-z]+?(\\.[A-Za-z]+)+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group("email"));
        }
    }
}