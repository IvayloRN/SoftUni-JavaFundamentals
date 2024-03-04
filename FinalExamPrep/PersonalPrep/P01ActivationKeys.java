package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Generate")){
            String command = input.split(">>>")[0];
            switch (command){
                case "Contains":
                    String substring = input.split(">>>")[1];
                    if (rawActivationKey.contains(substring)){
                        System.out.println(rawActivationKey + " contains " + substring);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String direction = input.split(">>>")[1];
                    int startIndex = Integer.parseInt(input.split(">>>")[2]);
                    int endIndex = Integer.parseInt(input.split(">>>")[3]);
                    if (direction.equals("Upper")){
                        String leftSide = rawActivationKey.substring(0, startIndex);
                        String rightSide = rawActivationKey.substring(endIndex);
                        String middleSide = rawActivationKey.substring(startIndex, endIndex).toUpperCase();
                        rawActivationKey = leftSide + middleSide + rightSide;
                        System.out.println(rawActivationKey);
                    }else if(direction.equals("Lower")){
                        String leftSide = rawActivationKey.substring(0, startIndex);
                        String rightSide = rawActivationKey.substring(endIndex);
                        String middleSide = rawActivationKey.substring(startIndex, endIndex).toLowerCase();
                        rawActivationKey = leftSide + middleSide + rightSide;
                        System.out.println(rawActivationKey);
                    }
                    break;
                case "Slice":
                    int startIndexToSlice = Integer.parseInt(input.split(">>>")[1]);
                    int endIndexToSlice = Integer.parseInt(input.split(">>>")[2]);
                    String leftSide = rawActivationKey.substring(0, startIndexToSlice);
                    String rightSide = rawActivationKey.substring(endIndexToSlice);
                    rawActivationKey = leftSide + rightSide;
                    System.out.println(rawActivationKey);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", rawActivationKey);
    }
}




