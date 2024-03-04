package javaFundamentals.week10.Lekcia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regix = "\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regix);
        Matcher matcher = pattern.matcher(input);

        List<String> numbersList = new ArrayList<>();

        while (matcher.find()) {
            numbersList.add(matcher.group());
        }
        System.out.println(String.join(", ", numbersList));

    }
}
