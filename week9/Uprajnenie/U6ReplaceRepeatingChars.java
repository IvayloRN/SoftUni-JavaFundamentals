package javaFundamentals.week9.Uprajnenie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U6ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> symbols = new ArrayList<>();
        for (char letter: input.toCharArray()) {
            symbols.add(letter);

        }
        for (int i = 0; i < symbols.size() -1; i++) {
            char symbA = symbols.get(i);
            char symbB = symbols.get(i +1);
            if (symbA == symbB){
                symbols.remove(i);
                i-=1;
            }

        }
        for (char letter: symbols) {
            System.out.print(letter);

        }

    }
}
