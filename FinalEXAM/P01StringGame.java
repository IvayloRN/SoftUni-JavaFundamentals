package javaFundamentals.FinalEXAM;

import java.util.Scanner;

public class P01StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")){
            String[] arrayForComs = input.split(" ");
            String command = arrayForComs[0];
            switch (command){
                case "Change":
                    String charToChange = arrayForComs[1];
                    String replacement = arrayForComs[2];
                    text = text.replace(charToChange, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String substring = arrayForComs[1];
                    if (text.contains(substring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }

                    break;
                case "End":
                    String endWord = arrayForComs[1];
                    int wordLenght = endWord.length();
                    int stIndex = text.length() - wordLenght;
                    int enIndex = text.length();
                    String toCheck = text.substring(stIndex, enIndex);
                    if (toCheck.equals(endWord)) {
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }

                    break;
                case "Uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);

                    break;
                case "FindIndex":
                    String charToFind = arrayForComs[1];
                    int index = text.indexOf(charToFind);
                    System.out.println(index);

                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(arrayForComs[1]);
                    int count = Integer.parseInt(arrayForComs[2]);
                    int endIndex = startIndex + count;
                    text = text.substring(startIndex, endIndex);
                    System.out.println(text);

                    break;




            }


            input = scanner.nextLine();
        }



    }
}
