package javaFundamentals.week9.Lekcia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<String> result = new ArrayList<>();

        for (String word: input) {
            for (int i = 0; i < word.length(); i++) {
                result.add(word);
            }

        }
        System.out.println(String.join("",result));
    }
}
