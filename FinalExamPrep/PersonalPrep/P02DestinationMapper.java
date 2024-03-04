package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        while (matcher.find()){
            destinations.add(matcher.group(2));
        }
        int travelPoints = 0;
        for (String dest: destinations) {
            for (int i = 0; i < dest.length(); i++) {
                travelPoints++;
            }
        }
        System.out.printf("Destinations: %s\n",(String.join(", ", destinations)));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}