package javaFundamentals.week7.U02Article;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        String title = input[0];
        String content = input[1];
        String artist = input[2];
        Article article = new Article(title , content , artist);
        for (int i = 1; i <= n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            String command = commands[0];
            String newInformation = commands[1];
            switch (command){
                case "Edit" :
                    article.edit(newInformation);
                    break;
                case "ChangeAuthor" :
                    article.changeAuthor(newInformation);
                    break;
                case "Rename" :
                    article.rename(newInformation);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
