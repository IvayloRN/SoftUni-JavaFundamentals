package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = Arrays.stream(scanner.nextLine()
                .split("\\|")).collect(Collectors.toList());

        Collections.reverse(myList);
        System.out.println(myList.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"
                .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"
                .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                .trim()  //"7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "") //"7  8 4 5 6  1 2 3"
                .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3"
    }
}
