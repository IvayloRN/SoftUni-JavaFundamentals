package javaFundamentals.week1;

import java.util.Scanner;

public class U11RageExpences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalCost = 0;

        if (lostGamesCount >= 12) {
            headsetPrice = headsetPrice * (lostGamesCount * 0.1 / 2);
            mousePrice = mousePrice * (lostGamesCount * 0.1 / 3);
            keyboardPrice = keyboardPrice * (lostGamesCount * 0.1 / 6);
            displayPrice = displayPrice * (lostGamesCount * 0.1 / 12);
            totalCost = headsetPrice + mousePrice + keyboardPrice + displayPrice;
        }else if (lostGamesCount >=6){
            headsetPrice = headsetPrice * (lostGamesCount * 0.1 / 2);
            mousePrice = mousePrice * (lostGamesCount * 0.1 / 3);
            keyboardPrice = keyboardPrice * (lostGamesCount * 0.1 / 6);
            totalCost = headsetPrice + mousePrice + keyboardPrice;
        }else if (lostGamesCount >= 3){
            headsetPrice = headsetPrice * (lostGamesCount * 0.1 / 2);
            mousePrice = mousePrice * (lostGamesCount * 0.1 / 3);
            totalCost = headsetPrice + mousePrice;
        } else if (lostGamesCount >=2) {
            totalCost = headsetPrice * (lostGamesCount * 0.1 / 2);
        }
        System.out.printf("Rage expenses: %.2f lv.",totalCost);

    }
}
