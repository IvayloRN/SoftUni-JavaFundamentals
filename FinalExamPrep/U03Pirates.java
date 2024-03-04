package javaFundamentals.FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class U03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , Integer> townPopulation = new LinkedHashMap<>();
        Map<String , Integer> townGold = new LinkedHashMap<>();
        while (!input.equals("Sail")){
            String town = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);
            if (townPopulation.containsKey(town)){
                int tempPop = townPopulation.get(town);
                int tempGold = townGold.get(town);
                townPopulation.put(town, tempPop + population);
                townGold.put(town, tempGold + gold);
            }else {
                townPopulation.put(town, population);
                townGold.put(town, gold);
            }
            input = scanner.nextLine();
        }
        String commands = scanner.nextLine();
        while (!commands.equals("End")){
            String command = commands.split("=>")[0];
            switch (command){
                case "Plunder":
                    String townToPlunder = commands.split("=>")[1];
                    int peopleToKill = Integer.parseInt(commands.split("=>")[2]);
                    int goldToPlunder = Integer.parseInt(commands.split("=>")[3]);
                    int tempPeop = townPopulation.get(townToPlunder) - peopleToKill;
                    int tempGold = townGold.get(townToPlunder) - goldToPlunder;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",townToPlunder, goldToPlunder, peopleToKill);
                    if (tempGold <= 0 || tempPeop <= 0){
                        System.out.printf("%s has been wiped off the map!\n",townToPlunder);
                        townPopulation.remove(townToPlunder);
                        townGold.remove(townToPlunder);
                    }else{
                        townPopulation.put(townToPlunder, tempPeop);
                        townGold.put(townToPlunder, tempGold);
                    }
                    break;
                case "Prosper":
                    String townToProsper = commands.split("=>")[1];
                    int goldToProsper = Integer.parseInt(commands.split("=>")[2]);
                    if (goldToProsper < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        int tempAmountOfGold = townGold.get(townToProsper) + goldToProsper;
                        townGold.put(townToProsper, tempAmountOfGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", goldToProsper, townToProsper, tempAmountOfGold);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        if (townPopulation.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", townPopulation.size());
            townPopulation.entrySet().forEach(entry-> {
                String town = entry.getKey();
                int gold = townGold.get(town);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",town,entry.getValue(),gold);
            });
        }
    }
}


