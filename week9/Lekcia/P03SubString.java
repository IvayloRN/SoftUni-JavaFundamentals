package javaFundamentals.week9.Lekcia;

import java.util.Scanner;

public class P03SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text  = scanner.nextLine();
        String finalWord = "";
        while (true){
            int indx = text.indexOf(word);
            if (indx == -1){
                break;
            }
            String leftSubstr = text.substring(0, indx);
            String rightSubstr = text.substring(indx + word.length());
            text = leftSubstr + rightSubstr;
        }
        System.out.println(text);
    }
}
