package javaFundamentals.week8.Lekcia;

import java.util.*;


public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String , List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            synonyms.putIfAbsent(word , new ArrayList<>());

            synonyms.get(word).add(synonym);

        }
        for (Map.Entry<String , List<String>> kvp: synonyms.entrySet()) {
            System.out.printf("%s - %s\n", kvp.getKey(), String.join(", ", kvp.getValue()));


        }

    }
}
