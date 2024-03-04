package javaFundamentals.week10.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U03StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String finalText = "";
        for (int i = 0; i < n; i++) {
            int starCounter = 0;
            String input = scanner.nextLine();
            for (int symbnum = 0; symbnum < input.length(); symbnum++) {
                char starLetters = input.toLowerCase().toCharArray()[symbnum];
                if (starLetters == 's' || starLetters == 't' || starLetters == 'a' || starLetters == 'r') {
                    starCounter++;
                }
            }
            for (int symbUpdate = 0; symbUpdate < input.length(); symbUpdate++) {
                char symb = input.toCharArray()[symbUpdate];
                symb = (char) ((char) symb - starCounter);
                finalText += symb;
            }
        }
        int attPlanetCounter = 0;
        int destrPlanetCounter = 0;
        List<String> attackedPlanet = new ArrayList<>();
        List<String> destroyedPlanet = new ArrayList<>();
        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*:(?<population>[\\d]+)[^@\\-!:>]*!(?<attack>[A-D])![^@\\-!:>]*->(?<soldierCount>[\\d]+)");
        Matcher matcher = pattern.matcher(finalText);
        while (matcher.find()){
            if (matcher.group("attack").equals("A")){
                attPlanetCounter++;
                attackedPlanet.add(matcher.group("name"));
            } else if (matcher.group("attack").equals("D")) {
                destrPlanetCounter++;
                destroyedPlanet.add(matcher.group("name"));
            }
        }
        Collections.sort(destroyedPlanet);
        Collections.sort(attackedPlanet);
        System.out.printf("Attacked planets: %d\n", attPlanetCounter);
        for (String planet:attackedPlanet) {
            System.out.printf("-> %s\n",planet);
        }
        System.out.printf("Destroyed planets: %d\n", destrPlanetCounter);
        for (String planet: destroyedPlanet) {
            System.out.printf("-> %s\n",planet);
        }
    }
}
