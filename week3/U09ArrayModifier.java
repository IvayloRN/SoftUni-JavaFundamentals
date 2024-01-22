package javaFundamentals.week3;

import java.util.Arrays;
import java.util.Scanner;

public class U09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream((scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int number1 = array[firstIndex];
                array[firstIndex] = array[secondIndex];
                array[secondIndex] = number1;


            } else if (command.contains("multiply")){
                //multiply {index1} {index2}"
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int resultOfMultiply = array[firstIndex] * array[secondIndex];
                array[firstIndex] = resultOfMultiply;


            } else if (command.equals("decrease")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;

                }
            }

            command = scanner.nextLine();
        }
        System.out.print(Arrays.toString(array).replace("[","").replace("]",""));

    }
}
