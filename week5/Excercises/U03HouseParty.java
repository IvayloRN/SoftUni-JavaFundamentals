package javaFundamentals.week5.Excercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> listOfNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(" ");
            String name = commands[0];
            if (commands.length == 3){
                if (!listOfNames.contains(name)){
                    listOfNames.add(name);
                }else{
                    System.out.printf("%s is already in the list!\n", name);
                }
            }else{
                if (listOfNames.contains(name)){
                    listOfNames.remove(name);
                }else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        for (String list:listOfNames) {
            System.out.println(list);
        }
    }
}
