package javaFundamentals.FinalExamPrep;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        String line = scanner.nextLine();
        while (!line.equals("Travel")){
            String[] comandsArray = line.split(":");
            String command = comandsArray[0];

            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(comandsArray[1]);
                    String tempWord = comandsArray[2];
                    if (ifValidIndx(index, stops)){
                        String left = stops.substring(0, index);
                        String right = stops.substring(index);
                        stops = left + tempWord + right;
                    }
//•	Add Stop:{index}:{string} – insert the given string at that index only if the index is valid
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(comandsArray[1]);
                    int endIndex = Integer.parseInt(comandsArray[2]);
                    if (ifValidIndx(startIndex, stops) && ifValidIndx(endIndex, stops)){
                        String left = stops.substring(0, startIndex);
                        String right = stops.substring(endIndex+1);
                        stops = left + right;
                    }
                    break;
                case "Switch":
                    String oldString = comandsArray[1];
                    String newString = comandsArray[2];
                        stops = stops.replace(oldString, newString);
                    break;
            }
            System.out.println(stops);
            line = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+ stops);
    }

    private static boolean ifValidIndx(int index, String str) {
        return index >= 0 && index < str.length();
    }
}
