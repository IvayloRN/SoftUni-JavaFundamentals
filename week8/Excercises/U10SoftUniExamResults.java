package javaFundamentals.week8.Excercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class U10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> languageCount = new LinkedHashMap<>();
        Map<String, Integer> userPoints = new LinkedHashMap<>();

        while (!input.equals("exam finished")){
            String[] myArray = input.split("-");
            String username = myArray[0];
            if (myArray.length > 2) {

                String language = myArray[1];
                int points = Integer.parseInt(myArray[2]);
                if (!userPoints.containsKey(username)){
                    userPoints.put(username, points);
                }else{
                    int tempPoints = userPoints.get(username);
                    if (userPoints.get(username) < points) {
                        userPoints.put(username, points);
                    }
                }
                if (!languageCount.containsKey(language)){
                    languageCount.put(language, 1);
                }else {
                    languageCount.put(language , languageCount.get(language) + 1);
                }
            }else{
                userPoints.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().forEach(e-> System.out.printf("%s | %d\n",e.getKey(), e.getValue()));
        System.out.println("Submissions:");
        languageCount.entrySet().forEach(e-> System.out.printf("%s - %d\n", e.getKey(), e.getValue()));


        userPoints.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).forEach(e-> System.out.println(e.getKey()+ " | " + e.getValue()));


    }
}
