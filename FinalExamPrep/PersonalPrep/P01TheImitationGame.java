package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String commands = scanner.nextLine();


        while (!commands.equals("Decode")){
            String[] myArray = commands.split("\\|");
            String command = myArray[0];
            switch (command){
                case "Move":
                    int numberOfLetters = Integer.parseInt(myArray[1]);
                    StringBuilder sb = new StringBuilder(text);
                    for (int i = 0; i < numberOfLetters; i++) {
                        sb.append(sb.charAt(0));
                        sb.deleteCharAt(0);
                    }
                    text = sb.toString();
                    break;
                case "Insert":
                    int index = Integer.parseInt(myArray[1]);
                    String value = myArray[2];
                    if (index <= text.length() && index >= 0){
                    String leftSide = text.substring(0, index);
                    String rightSide = text.substring(index);
                    text = leftSide + value + rightSide;
                }

                    break;
                case "ChangeAll":
                    String substring = myArray[1];
                    String replacement = myArray[2];
                    text = text.replace(substring,replacement);
                    break;
            }
            commands = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",text);

    }
}


