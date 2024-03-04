package javaFundamentals.week8.Excercises;

import java.util.*;

public class U02MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourcesQuantity.containsKey(resource)){
                resourcesQuantity.put(resource, quantity);
            }else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantity);


            }

            resource = scanner.nextLine();
        }
        resourcesQuantity.entrySet().forEach(entry-> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
