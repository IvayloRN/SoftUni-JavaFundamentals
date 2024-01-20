package javaFundamentals.week1;

import java.util.Scanner;

public class U07Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumOfCoins = 0;

        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sumOfCoins += coins;
            }else {
                System.out.printf("Cannot accept %.2f\n",coins);
            }
            input = scanner.nextLine();
        }
        String products = scanner.nextLine();
        while (!products.equals("End")){
            switch (products) {
                case "Nuts":
                    if (sumOfCoins >= 2.0) {
                        sumOfCoins-=2.0;
                        System.out.println("Purchased Nuts");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumOfCoins >= 0.7) {
                        sumOfCoins-=0.7;
                        System.out.println("Purchased Water");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumOfCoins >= 1.5) {
                        sumOfCoins-=1.5;
                        System.out.println("Purchased Crisps");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumOfCoins >= 0.8) {
                        sumOfCoins-=0.8;
                        System.out.println("Purchased Soda");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumOfCoins >= 1.0) {
                        sumOfCoins-=1.0;
                        System.out.println("Purchased Coke");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;

            }
            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sumOfCoins);
    }
}
