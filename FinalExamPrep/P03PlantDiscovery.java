package javaFundamentals.FinalExamPrep;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String , Integer> rarityList = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();
        for (int count = 1; count <= n; count++) {
            String input = scanner.nextLine();
            String platName = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            if (!rarityList.containsKey(platName)) {
                rarityList.put(platName, rarity);
                plantsRating.put(platName, new ArrayList<>());
            }else{
                rarityList.put(platName, rarity);
            }
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Exhibition")){
            String command = commands.split(" ")[0];
            String plantName = commands.split(" ")[1];
            if (!rarityList.containsKey(plantName)) {
                System.out.println("error");
                commands = scanner.nextLine();
                continue;
            }
            switch (command){
                case "Rate:":
                    double rating = Double.parseDouble(commands.split(" ")[3]);
                    plantsRating.get(plantName).add(rating);
                    break;
                case "Update:":
                    int rarityRating = Integer.parseInt(commands.split(" ")[3]);
                    rarityList.put(plantName, rarityRating);

                    break;
                case "Reset:":
                    plantsRating.get(plantName).clear();
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        rarityList.entrySet().forEach(entry -> {
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            double averageRaiting = plantsRating.get(plantName).stream().mapToDouble(a->a).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",plantName,rarity, averageRaiting );
        });
    }
}




