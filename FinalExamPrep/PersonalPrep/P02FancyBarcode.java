package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]+[A-Z])([@][#]+)");
        List<String> listOfAllBarcodes = new ArrayList<>();
        List<String> validBarcodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int counter = 0;
            String nums = "";
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);


            while (matcher.find()){

                String temp = matcher.group("barcode");
                for (int j = 0; j < temp.length(); j++) {
                    char symb = temp.charAt(j);
                    if (Character.isDigit(symb)){
                        counter++;
                        nums+=symb;
                }
                }
            }
            if (counter == 0){
                System.out.println("Product group: 00");
            }else{
                System.out.println("Product group: " + nums);
            }
        }

    }
}
