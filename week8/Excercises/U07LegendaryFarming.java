package javaFundamentals.week8.Excercises;

import java.util.*;

public class U07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Map<String, Integer> materialCollection = new LinkedHashMap<>();
        materialCollection.put("shards", 0);
        materialCollection.put("fragments", 0);
        materialCollection.put("motes", 0);
        Map<String, Integer> junkCollection = new LinkedHashMap<>();

        boolean enoughtMaterials = false;
        while (!enoughtMaterials) {
            String input = scanner.nextLine().toLowerCase();
            String[] inputArr = input.split(" ");

            for (int i = 0; i <= inputArr.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputArr[i]);
                String material = inputArr[i + 1];
                if (material.equals("shards") || material.equals("motes") || material.equals("fragments")) {
                    int currentQuantity = materialCollection.get(material);
                    materialCollection.put(material, currentQuantity + quantity);
                } else {
                    if(junkCollection.containsKey(material)) {
                        int currentJunkQuantity = junkCollection.get(material);
                        junkCollection.put(material, currentJunkQuantity + quantity);
                    }else{
                        junkCollection.put(material,quantity);
                    }
                }
                if (materialCollection.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    materialCollection.put(material, materialCollection.get("shards") - 250 );
                    enoughtMaterials = true;
                    break;
                } else if (materialCollection.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialCollection.put(material, materialCollection.get("fragments") - 250 );
                    enoughtMaterials = true;
                    break;
                }else if (materialCollection.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialCollection.put(material, materialCollection.get("motes") - 250);
                    enoughtMaterials = true;
                    break;
                }
            }
            if (enoughtMaterials){
                break;
            }
        }
        materialCollection.entrySet().forEach(entry -> System.out.println(entry.getKey()+": " + entry.getValue() ));
        junkCollection.entrySet().forEach(entry -> System.out.println(entry.getKey()+": " + entry.getValue() ));
    }
}
