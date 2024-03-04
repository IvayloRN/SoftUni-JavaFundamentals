package javaFundamentals.FinalExamPrep;

import java.util.Scanner;

public class U01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String input = scanner.nextLine();


        while (!input.equals("Reveal")){
            String[] inputArray = input.split(":\\|:");
            String command = inputArray[0];
            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(inputArray[1]);
                    String left = message.substring(0, index);
                    String right = message.substring(index);
                    message = left + " " + right;
                    System.out.println(message);
//•	"InsertSpace:|:{index}":
//o	Inserts a single space at the given index. The given index will always be valid.
                    break;
                case "Reverse":
                    String substring = inputArray[1];
                    if (message.contains(substring)){
                        message = message.replace(substring, "");
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();
                        message = message + reversedSubstring;
                        System.out.println(message);
                    }else{
                        System.out.println("error");
                    }
//•	"Reverse:|:{substring}":
//o	If the message contains the given substring, cut it out, reverse it and add it at the end of the message.
//o	If not, print "error".
//o	This operation should replace only the first occurrence of the given substring if there are two or more occurrences.
                    break;
                case "ChangeAll":
                    String substringToChange = inputArray[1];
                    String replacement = inputArray[2];
                    message = message.replaceAll(substringToChange, replacement);
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
