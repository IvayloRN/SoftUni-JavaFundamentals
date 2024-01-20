package javaFundamentals.week2;

import java.util.Scanner;

public class U09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingSpicesYeld = Integer.parseInt(scanner.nextLine());
        int totalYeldCollected = 0;
        int yeldCollected = 0;
        int daysCount = 0;
        while (startingSpicesYeld >= 100){
            yeldCollected = startingSpicesYeld - 26;
            startingSpicesYeld -= 10;

            totalYeldCollected += yeldCollected;


            daysCount++;
        }

        if (totalYeldCollected >= 26){
            totalYeldCollected -= 26;
        }
        System.out.println(daysCount);
        System.out.println(totalYeldCollected);

    }
}
