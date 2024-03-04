package javaFundamentals.week8.Excercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class U03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> productPricesDbl = new LinkedHashMap<>();
        Map<String, Integer> productQuantityInt = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double priceOfProduct = Double.parseDouble(input.split(" ")[1]);
            int quantityOfProduct = Integer.parseInt(input.split(" ")[2]);
            if (!productPricesDbl.containsKey(product)){
                productPricesDbl.put(product, priceOfProduct);
                productQuantityInt.put(product, quantityOfProduct);
            }else{
                productPricesDbl.put(product,priceOfProduct);
                int currentQuantity = productQuantityInt.get(product);
                productQuantityInt.put(product, currentQuantity + quantityOfProduct);
            }
            input = scanner.nextLine();
        }
        productQuantityInt.entrySet().forEach(entry -> {
            String productName = entry.getKey();
            double totalPrice = entry.getValue() * productPricesDbl.get(productName);
            System.out.printf("%s -> %.2f\n",entry.getKey(), totalPrice);
        });
    }
}