package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U06CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!firstHand.isEmpty() && !secondHand.isEmpty()){
            if (firstHand.get(0) > secondHand.get(0)){
                firstHand.add(firstHand.get(0));
                firstHand.add(secondHand.get(0));
                firstHand.remove(firstHand.get(0));
                secondHand.remove(secondHand.get(0));


            }else if (firstHand.get(0) < secondHand.get(0)){
                secondHand.add(secondHand.get(0));
                secondHand.add(firstHand.get(0));
                secondHand.remove(secondHand.get(0));
                firstHand.remove(firstHand.get(0));



            }else {
                firstHand.remove(firstHand.get(0));
                secondHand.remove(secondHand.get(0));
            }
         //   if (firstHand.size() == 0 || secondHand.size() == 0){
          //      break;
         //   }
        }

        int total = 0;
        if (secondHand.size() > firstHand.size()){
            for (int calcNum: secondHand) {
                total += calcNum;
            }
            System.out.printf("Second player wins! Sum: %d",total);
        }else if (firstHand.size() > secondHand.size()){
            for (int calcNum: firstHand) {
                total+=calcNum;
            }
            System.out.printf("First player wins! Sum: %d",total);
        }
    }
}
