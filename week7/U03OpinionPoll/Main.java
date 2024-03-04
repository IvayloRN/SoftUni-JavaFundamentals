package javaFundamentals.week7.U03OpinionPoll;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            Person person = new Person(name , age);
            if (person.getAge() > 30){
                System.out.println(person.getName() + " - " + person.getAge());
            }

        }


    }
}
