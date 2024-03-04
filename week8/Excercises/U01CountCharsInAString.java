package javaFundamentals.week8.Excercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class U01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol:input.toCharArray()) {
            if (symbol == ' '){
                continue;
            }
            if (!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol, 1);
            } else {
                int currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol, currentCount + 1);
            }

        }
        // 1 Начин на отпечатване на МАP
       // for (Map.Entry<Character, Integer> entry: symbolCount.entrySet()) {
        //    System.out.println(entry.getKey() + " -> " + entry.getValue());

      //  }
        // 2 Начин
        symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
