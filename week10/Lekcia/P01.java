package javaFundamentals.week10.Lekcia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reggex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(reggex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
