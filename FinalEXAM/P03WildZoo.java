package javaFundamentals.FinalEXAM;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> animalFood = new LinkedHashMap<>();
        Map<String, Integer> animalArea = new LinkedHashMap<>();
        Map<String , String> nameArea = new LinkedHashMap<>();

        while (!input.equals("EndDay")){
            String temp = input.split(" ")[1];
            String[] arrayOfComs = temp.split("-");
            String command = input.split(" ")[0];
            String name = arrayOfComs[0];
            int food = Integer.parseInt(arrayOfComs[1]);
            switch (command){
                case "Add:":
                    String areaOfLiving = arrayOfComs[2];
                    if (!animalFood.containsKey(name)){
                        animalFood.put(name, food);
                        nameArea.put(name, areaOfLiving);
                        if (animalArea.containsKey(areaOfLiving)){
                            animalArea.put(areaOfLiving, animalArea.get(areaOfLiving) + 1);
                        }else{
                            animalArea.put(areaOfLiving, 1);
                        }
                    }else{
                        int tempFood = animalFood.get(name);
                        animalFood.put(name, tempFood + food);
                    }
                    break;
                case "Feed:":
                    if (animalFood.containsKey(name)){
                        int tempFoods = animalFood.get(name);
                        int newFoodRequirement = tempFoods - food;
                        if (newFoodRequirement <= 0){
                            animalFood.remove(name);
                            int tempReq = animalArea.get(nameArea.get(name));
                            animalArea.put(nameArea.get(name), tempReq - 1);             //~~~~~~~~~~~~~

                            System.out.printf("%s was successfully fed\n",name);
                        }else{
                            animalFood.put(name, newFoodRequirement);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalFood.entrySet().forEach(e-> {
            String animalName = e.getKey();
            int foodReq = e.getValue();
            System.out.printf(" %s -> %dg\n",animalName, foodReq);
        });
        System.out.println("Areas with hungry animals:");
        animalArea.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() > 0)
                .forEach(e->{
            int count = e.getValue();
            String area = e.getKey();
            System.out.printf("%s: %d\n",area, count);
        });
    }
}
