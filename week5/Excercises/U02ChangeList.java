package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] myArray = input.split(" ");
            String command = myArray[0];
            int element = Integer.parseInt(myArray[1]);
            switch (command){
                case "Delete":
                        nums.removeAll(Arrays.asList(element));
                    break;
//•	Insert {element} {position} - insert element at the given position
                case "Insert":
                    int position = Integer.parseInt(myArray[2]);
                    nums.add(position, element);
                    break;
            }
            input = scanner.nextLine();
        }

        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}
