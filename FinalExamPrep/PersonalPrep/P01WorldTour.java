package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String commands = scanner.nextLine();
        while (!commands.equals("Travel")){
            String[] myArray = commands.split(":");
            String command = myArray[0];
            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(myArray[1]);
                    String stringToInput = myArray[2];
                    if (indexIsValid(index, input)){
                        String leftSide = input.substring(0, index);
                        String rightSide = input.substring(index);
                        input = leftSide + stringToInput + rightSide;
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(myArray[1]);
                    int endIndex = Integer.parseInt(myArray[2]);
                    if (indexIsValid(startIndex, input) && indexIsValid(endIndex, input)){
                        String leftSide = input.substring(0, startIndex);
                        String rightSide = input.substring(endIndex+1);
                        input = leftSide + rightSide;
                    }
                    break;
                case "Switch":
                    String oldString = myArray[1];
                    String newString = myArray[2];
                    input = input.replace(oldString, newString);
                    break;
            }
            System.out.println(input);
            commands = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",input);
    }

    private static boolean indexIsValid(int index, String input) {
        return index >= 0 && index < input.length();
    }
}
