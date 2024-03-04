package javaFundamentals.week4;

import java.util.Scanner;

public class U04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean passwordCheck = true;
        boolean validPassword = false;
        boolean validPassword2 = false;
        boolean validPassword3 = false;

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }else{
            validPassword = true;
        }
        passwordCheck = passwordCheck(passwordCheck , password);
        if (passwordCheck){
            System.out.println("Password must consist only of letters and digits");
        }else {
            validPassword2 = true;
        }
        if (passwordCheck2(password)  < 2){
            System.out.println("Password must have at least 2 digits");
        }else{
            validPassword3 = true;
        }
        if (validPassword && validPassword2 && validPassword3){
            System.out.println("Password is valid");
        }
    }

    public static boolean passwordCheck(boolean pass , String password) {
        int nonCharNum = 0;
        for (int i = 0; i < password.length(); i++) {
            char next = password.charAt(i);
            if (next < 48) {
                nonCharNum++;
                break;
            } else if (next > 57 && next < 65) {
                nonCharNum++;
                break;
            } else if (next > 90 && next < 97) {
                nonCharNum++;
            } else if (next > 122) {
                nonCharNum++;
            }
        }if (nonCharNum > 0){
            return pass;
        }else {
            return false;
        }

    }
    public static int passwordCheck2 (String password){
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            char next =password.charAt(i);
            if (next >= 48 && next <= 57){
                digits++;
            }
        }
        return digits;
    }

}
