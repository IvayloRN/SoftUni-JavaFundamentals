package javaFundamentals.week1;

import java.util.Scanner;

public class U5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password+= currentSymbol;
        }
        String enteredPassword = scanner.nextLine();
        int counterWrongPass = 1;
        while (!enteredPassword.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            counterWrongPass++;
            if (counterWrongPass == 4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            enteredPassword = scanner.nextLine();

        }
        System.out.printf("User %s logged in.",username);

    }

}

