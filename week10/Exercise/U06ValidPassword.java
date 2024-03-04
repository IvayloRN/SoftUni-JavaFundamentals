package javaFundamentals.week10.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U06ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(?<password>_\\.+[A-Z][A-Za-z0-9{4,}]+[A-Z]_\\.+)");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String password = matcher.group("password");
                StringBuilder sbDigitsCategory = new StringBuilder();
                for (char symbol:password.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        sbDigitsCategory.append(symbol);
                    }
                }
                if (sbDigitsCategory.length() == 0){
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + sbDigitsCategory);
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}