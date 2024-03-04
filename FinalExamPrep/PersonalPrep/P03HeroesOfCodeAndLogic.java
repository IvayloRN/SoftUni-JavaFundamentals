package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroHPmap = new LinkedHashMap<>();
        Map<String, Integer> heroMANAmap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String heroName = input.split(" ")[0];
            int heroHp = Integer.parseInt(input.split(" ")[1]);
            int heroMana = Integer.parseInt(input.split(" ")[2]);
            if (heroHp > 100){
                heroHp = 100;
            }
            if (heroMana > 200){
                heroMana = 200;
            }
            heroHPmap.put(heroName, heroHp);
            heroMANAmap.put(heroName, heroMana);
        }
        String commands = scanner.nextLine();
        while (!commands.equals("End")){
            String command = commands.split(" - ")[0];
            String hero = commands.split(" - ")[1];
            int amountDmgMp = Integer.parseInt(commands.split(" - ")[2]);
            switch (command){
                case "CastSpell":
                    String spell = commands.split(" - ")[3];
                     if (heroMANAmap.get(hero) >= amountDmgMp){
                         int tempMP = heroMANAmap.get(hero) - amountDmgMp;
                         heroMANAmap.put(hero, tempMP);
                         System.out.printf("%s has successfully cast %s and now has %d MP!\n", hero, spell, tempMP);
                     }else {
                         System.out.printf("%s does not have enough MP to cast %s!\n",hero, spell);
                     }
                    break;
                case "TakeDamage":
                    String attacker = commands.split(" - ")[3];
                    if (heroHPmap.get(hero) > amountDmgMp){
                        int tempHP = heroHPmap.get(hero) - amountDmgMp;
                        heroHPmap.put(hero, tempHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", hero, amountDmgMp, attacker , tempHP);

                    }else{
                        System.out.printf("%s has been killed by %s!\n",hero, attacker);
                        heroHPmap.remove(hero);
                    }
                    break;
                case "Recharge":
                    int tempMp = heroMANAmap.get(hero) + amountDmgMp;
                    if (tempMp > 200){
                        int difMp = amountDmgMp - (tempMp - 200);
                        tempMp = 200;
                        System.out.printf("%s recharged for %d MP!\n", hero, difMp);
                        heroMANAmap.put(hero, tempMp);
                        break;
                    }
                    heroMANAmap.put(hero, tempMp);
                    System.out.printf("%s recharged for %d MP!\n", hero, amountDmgMp);
                    break;
                case "Heal":
                    int tempHp = heroHPmap.get(hero) + amountDmgMp;
                    if (tempHp > 100){
                        int difHp = amountDmgMp - (tempHp - 100);
                        tempHp = 100;
                        System.out.printf("%s healed for %d HP!\n", hero, difHp);
                        heroHPmap.put(hero, tempHp);
                        break;
                    }
                    heroHPmap.put(hero, tempHp);
                    System.out.printf("%s healed for %d HP!\n", hero, amountDmgMp);
                    break;
            }
            commands = scanner.nextLine();
        }
        heroHPmap.entrySet().forEach(entry -> {
            String heroName = entry.getKey();
            int hp = entry.getValue();
            int mp = heroMANAmap.get(heroName);
            System.out.printf("%s\n HP: %d\n MP: %d\n",heroName, hp, mp);
        });
    }
}
