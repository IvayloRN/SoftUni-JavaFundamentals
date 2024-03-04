package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] commands = input.split(" ");
            String command = commands[0];
            switch (command){
                case "Add":
                    int addNum = Integer.parseInt(commands[1]);
                    listOfNums.add(addNum);
                    break;
                case "Insert":
                    int insertNum = Integer.parseInt(commands[1]);
                    int insertIndex = Integer.parseInt(commands[2]);
                    if (insertIndex < listOfNums.size() && insertIndex >= 0) {
                        listOfNums.add(insertIndex, insertNum);
                    }else {
                        System.out.println("Invalid index");
                        break;
                    }
                    break;
                case "Remove":
                        int removeIndex = Integer.parseInt(commands[1]);
                    if (removeIndex < listOfNums.size() && removeIndex >= 0) {
                        listOfNums.remove(removeIndex);
                    }else {
                        System.out.println("Invalid index");
                        break;
                    }
                    break;
                case "Shift":
                    String position = commands[1];
                    int shiftCount = Integer.parseInt(commands[2]);
                    if (position.equals("left")){
                        for (int i = 0; i < shiftCount; i++) {
                            int tempNum = listOfNums.get(0);
                            listOfNums.remove(0);
                            listOfNums.add(tempNum);
                        }
                    }else{
                        for (int i = 0; i < shiftCount; i++) {
                            int tempNum = listOfNums.get(listOfNums.size() - 1);
                            listOfNums.remove(listOfNums.size() - 1);
                            listOfNums.add(0, tempNum);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int list:listOfNums) {
            System.out.print(list + " ");
        }
    }
}