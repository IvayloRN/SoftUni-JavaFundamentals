package javaFundamentals.week10.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]+?)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;


        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String furnitureName = matcher.group(1);
                double furniturePrice = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                double pricePerFurniture  = furniturePrice * quantity;
                totalPrice += pricePerFurniture;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);

    }
}
//      (?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\.?[0-9]+?)!(?<quantity>[0-9]+)