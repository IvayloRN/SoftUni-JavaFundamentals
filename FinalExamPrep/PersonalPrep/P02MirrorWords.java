package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> listOfFirstWords = new ArrayList<>();
        List<String> listOfSecondWords = new ArrayList<>();
        List<String> finalList = new ArrayList<>();
        int numMatches = 0;
        while (matcher.find()){
            listOfFirstWords.add(matcher.group("word1"));
            listOfSecondWords.add(matcher.group("word2"));
            numMatches++;
        }
        for (int i = 0; i < listOfFirstWords.size(); i++) {
            if (listOfFirstWords.get(i).length() == listOfSecondWords.get(i).length()) {
                String tempWord = listOfSecondWords.get(i);
                String mirrorWord = "";
                for (int j = tempWord.length() -1; j >= 0; j--) {
                    mirrorWord += tempWord.charAt(j);
                }
                if (listOfFirstWords.get(i).equals(mirrorWord)){
                    finalList.add(listOfFirstWords.get(i) + " <=> " + tempWord);
                }
            }

        }
        if (numMatches <= 0) {
            System.out.printf("No word pairs found!\n");
            System.out.println("No mirror words!");
        }else {
            System.out.printf("%d word pairs found!\n", numMatches);
            if (finalList.isEmpty()) {
                System.out.println("No mirror words!");
            } else {
                System.out.printf("The mirror words are:\n");
                System.out.println(String.join(", ", finalList));
            }
        }
    }
}