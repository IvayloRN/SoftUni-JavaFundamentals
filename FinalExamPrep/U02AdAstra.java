package javaFundamentals.FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\||#)(?<foodType>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(input);
        int calories = 0;
        List<String> finalDataForPrint = new ArrayList<>();

        while (matcher.find()){
            int caloriesData = Integer.parseInt(matcher.group("calories"));
            calories += caloriesData;
            String output = String.format("Item: %s, Best before: %s, Nutrition: %s"
                    , matcher.group("foodType")
                    , matcher.group("expirationDate")
                    , matcher.group("calories"));
            finalDataForPrint.add(output);
        }
        int foodLastsDays = calories / 2000;
        System.out.printf("You have food to last you for: %d days!\n",foodLastsDays);

        for (String print:finalDataForPrint) {
            System.out.println(print);
        }
    }
}
//(\||#)(?<foodType>[A-Za-z\s]+)\1(?<expirationDate>[0-9]{2}\/[0-9]{2}\/[0-9]{2})\1(?<calories>[0-9]{1,5})\1

//•	First, print the number of days you will be able to last with the food you have:
//"You have food to last you for: {days} days!"
//•	The output for each food item should look like this:
//"Item: {item name}, Best before: {expiration date}, Nutrition: {calories}"