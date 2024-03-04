package javaFundamentals.week4;

import java.util.Scanner;

public class U02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        vowelsCheck(input);
    }
    public static void vowelsCheck (String input){
        int vowsCount = 0;
        for (int symb = 0; symb < input.length(); symb++) {
            char check = input.charAt(symb);
            if (check == 'a'  || check == 'e'  || check == 'o'  || check == 'u'  || check == 'i'){
                vowsCount++;
            }
        }
        System.out.println(vowsCount);
    }

}
