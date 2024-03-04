package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.Scanner;

public class P01Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String commands = scanner.nextLine();
        while (!commands.equals("Done")){
            String command = commands.split(" ")[0];
            switch (command){
                case "TakeOdd":
                    String temp = "";
                    for (int i = 1; i < password.length(); i+=2) {
                        temp += password.charAt(i);
                    }
                    password = temp;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands.split(" ")[1]);
                    int lenght = Integer.parseInt(commands.split(" ")[2]);
                    String leftSide = password.substring(0, index);
                    String rightSide = password.substring(index+lenght);
                    password = leftSide + rightSide;
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commands.split(" ")[1];
                    String substitute = commands.split(" ")[2];
                    if (password.contains(substring)){
                        password = password.replaceAll(substring, substitute);
                        System.out.println(password);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}