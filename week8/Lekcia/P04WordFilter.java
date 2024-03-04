package javaFundamentals.week8.Lekcia;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);


        for (String word: items) {
            System.out.println(word);
        }

    }
}
