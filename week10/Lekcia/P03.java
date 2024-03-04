package javaFundamentals.week10.Lekcia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s\n",matcher.group("day"),matcher.group(3),matcher.group("year"));
        }


//•	Day: 13, Month: Jul, Year: 1928

    }
}
