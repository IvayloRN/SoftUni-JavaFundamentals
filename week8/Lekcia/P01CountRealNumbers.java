package javaFundamentals.week8.Lekcia;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Double , Integer> numbersCount = new TreeMap<>();

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double num: nums) {
            if (numbersCount.containsKey(num)){
                numbersCount.put(num , numbersCount.get(num) + 1);
            }else{
                numbersCount.put(num, 1);
            }

        }
        for (Map.Entry<Double , Integer> kvp: numbersCount.entrySet()) {
            String keyFormated = new DecimalFormat("#.####").format(kvp.getKey());
            System.out.printf("%s -> %d\n",keyFormated, kvp.getValue() );

        }

    }
}
