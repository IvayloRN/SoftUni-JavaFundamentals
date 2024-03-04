package javaFundamentals.FinalEXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([\\S]+)>(?<g1>[0-9]{3})\\|(?<g2>[a-z]{3})\\|(?<g3>[A-Z]{3})\\|(?<g4>[\\S^<>]{3})<\\1");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String password = matcher.group("g1") +matcher.group("g2") +matcher.group("g3") +matcher.group("g4");
                System.out.println("Password: " + password);

            }else{
                System.out.println("Try another password!");
            }
        }
    }
}
//([\S]+)>(?<g1>[0-9]{3})\|(?<g2>[a-z]{3})\|(?<g3>[A-Z]{3})\|(?<g4>[\S^<>]{3})<\1