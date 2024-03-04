package javaFundamentals.week9;

import java.util.Arrays;
import java.util.Scanner;

public class sd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
            String result = sb.toString();
            sb.setLength(0);
            sb.charAt(1);
            sb.insert(1, "Hello");
            sb.replace(1 , 3 , "hello");
        }

        Character.isAlphabetic(1);
        Character.isDigit(1);




    }
}
