package javaFundamentals.week2;

import java.util.Scanner;

public class U08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bigestQuantityModel = 0.00;
        String biggestModel = "";
        for (int lines = 0; lines < n; lines++) {
            String kegModel = scanner.nextLine();
            double radiusR = Double.parseDouble(scanner.nextLine());
            int heighH = Integer.parseInt(scanner.nextLine());
            double sizeOfCurrent = Math.PI * Math.pow(radiusR,2) * heighH;
            if (bigestQuantityModel < sizeOfCurrent){
                biggestModel = kegModel;
                bigestQuantityModel = sizeOfCurrent;
            }

        }
        System.out.println(biggestModel);
    }
}
//π * r^2 * h.