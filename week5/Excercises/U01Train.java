package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commands = input.split(" ");
            if (commands[0].equals("Add")) {
                int num = Integer.parseInt(commands[1]);
                listOfWagons.add(num);
            }else{
                int num = Integer.parseInt(commands[0]);
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if (listOfWagons.get(i) + num <= maxCapacity) {
                        listOfWagons.set(i, listOfWagons.get(i) + num);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int list:listOfWagons) {
            System.out.print(list + " ");
        }

    }
}
