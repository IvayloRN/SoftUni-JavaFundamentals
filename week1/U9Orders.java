package javaFundamentals.week1;

import java.util.Scanner;

public class U9Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerOrder = 0;
        double totalPrice = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            pricePerOrder = ((days * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f\n",pricePerOrder);
            totalPrice += pricePerOrder;
        }
        System.out.printf("Total: $%.2f",totalPrice);

    }
}
