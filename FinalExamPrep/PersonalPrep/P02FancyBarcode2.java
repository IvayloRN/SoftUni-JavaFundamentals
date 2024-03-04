package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])([@][#]+)");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                int digitCounter = 0;
                String group = "";
                String barcode = matcher.group("barcode");
                for (int sym = 0; sym < barcode.length(); sym++) {
                    char symb = barcode.charAt(sym);
                    if (Character.isDigit(symb)){
                        digitCounter++;
                        group += symb;
                    }
                }
                if (digitCounter <= 0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s\n", group);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
