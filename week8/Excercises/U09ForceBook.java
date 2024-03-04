package javaFundamentals.week8.Excercises;

import java.util.*;

public class U09ForceBook   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> forcesList = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){
            if (input.contains(" | ")){
                String[] sideArray = input.split(" \\| ");
                String side = sideArray[0];
                String user = sideArray[1];
                if (!forcesList.containsKey(side)) {
                    forcesList.put(side, new ArrayList<>());
                }
                    boolean isExist = false;
                    for (List<String>users: forcesList.values()) {
                        if (users.contains(user)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist){
                        forcesList.get(side).add(user);
                    }

            }else{
                String[] userArray = input.split(" -> ");
                String team = userArray[1];
                String player = userArray[0];
                forcesList.entrySet().forEach(e-> e.getValue().remove(player));
                if (!forcesList.containsKey(team)){
                    forcesList.put(team, new ArrayList<>());
                    forcesList.get(team).add(player);
                }else{
                    forcesList.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);

            }
            input = scanner.nextLine();

        }
        forcesList.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(player -> System.out.println("! " + player));});

    }
}
