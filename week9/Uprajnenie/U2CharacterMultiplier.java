package javaFundamentals.week9.Uprajnenie;

import java.util.Scanner;

public class U2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstName = input[0];
        String secondName = input[1];
        sumOfNames(firstName, secondName);

    }
    public static void sumOfNames (String firstName, String secondName){
        int maxLenght = Math.max(firstName.length(), secondName.length());
        int minLenght = Math.min(firstName.length(), secondName.length());
        int sum = 0;
        for (int position = 0; position <= minLenght - 1; position++) {
            sum += firstName.charAt(position) * secondName.charAt(position);
        }
        if (firstName.length() == secondName.length()){
            System.out.println(sum);
        }else if(maxLenght == firstName.length()){
            for (int i = minLenght; i < maxLenght; i++) {
                sum += firstName.charAt(i);
            }
            System.out.println(sum);
        }else{
            for (int i = minLenght; i < maxLenght; i++) {
                sum += secondName.charAt(i);
            }
            System.out.println(sum);
        }
    }
}