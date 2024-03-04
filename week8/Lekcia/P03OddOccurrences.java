package javaFundamentals.week8.Lekcia;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" ")).map(e -> e.toLowerCase()).toArray(String[]::new);

        LinkedHashMap<String, Integer> wordMaps = new LinkedHashMap<>();

        for (String word: words) {
            if (wordMaps.containsKey(word)){
                wordMaps.put(word , wordMaps.get(word) + 1);
            }else{
                wordMaps.put(word, 1);
            }

        }
        String[] result = wordMaps.entrySet().stream().filter(entry -> entry.getValue() % 2 != 0)
                .map(entry -> entry.getKey())
                .toArray(String[]::new);

        System.out.println(String.join(", " , result));
    }
}
