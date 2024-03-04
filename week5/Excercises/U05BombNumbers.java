package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] input = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int specialNumber = input[0];
        int power = input[1];
        while (listOfNums.contains(specialNumber)){
            int index = listOfNums.indexOf(specialNumber);
            int bombLeft = index - power;
            if (bombLeft < 0){
                bombLeft = 0;
            }
            int bombRight = index + power;
            if (bombRight > listOfNums.size() -1){
                bombRight = listOfNums.size() -1;
            }
            for (int i = bombRight; i >= index; i--) {
                listOfNums.remove(i);
            }

            for (int i = index-1; i >= bombLeft; i--) {
                listOfNums.remove(i);
            }
        }
        int result = 0;
        for (int total: listOfNums) {
            result += total;
        }
        System.out.println(result);
    }
}
