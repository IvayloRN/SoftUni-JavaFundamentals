package javaFundamentals.week2;

import java.util.Scanner;

public class U11Snowballws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int snow = 0;
        int time = 0;
        int quality = 0;
        double bestSnowball = 0;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballStats = Math.pow((snowballSnow * 1.00 / snowballTime) , snowballQuality);
            //         int partOfFormula = snowballSnow / snowballTime;
            //           int snowballStats = (int)Math.pow(partOfFormula , snowballQuality);
            if (bestSnowball < snowballStats) {
                bestSnowball = snowballStats;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)" ,snow , time, bestSnowball , quality );
    }
}
