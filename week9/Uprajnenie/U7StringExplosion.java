package javaFundamentals.week9.Uprajnenie;

import java.util.Scanner;

public class U7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);

        int totalPower = 0;
        for (int i = 0; i < builder.length(); i++) {
            char currentSymbol = builder.charAt(i);
            if (currentSymbol == '>'){
                int power = Integer.parseInt(String.valueOf(builder.charAt(i+1)));
                totalPower +=power;

            } else if (currentSymbol != '>' && totalPower > 0) {
                builder.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(builder);
    }
}
