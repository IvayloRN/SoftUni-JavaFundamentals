package javaFundamentals.week8.Excercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class U04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        Map<String , String> registration = new LinkedHashMap<>();
        for (int count = 1; count <= countCommands; count++) {
            String commands = scanner.nextLine();
            String[] commandParts = commands.split(" ");
            String command = commandParts[0];
            String username = commandParts[1];

            switch (command){
                case "register":
                    String licensePlate = commandParts[2];
                    if (registration.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s\n",licensePlate);
                    }else{
                        registration.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully\n", username , licensePlate);
                    }

                    break;

                case "unregister":
                    if (!registration.containsKey(username)){
                        System.out.printf("ERROR: user %s not found\n", username);
                    }else {
                        registration.remove(username);
                        System.out.printf("%s unregistered successfully\n",username);
                    }
                    break;
            }
        }
        for (Map.Entry<String , String> entry: registration.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue() );
        }
       // registration.entrySet().forEach(entry -> System.out.printf("%s => %s\n", entry.getKey(), entry.getValue()));
    }
}