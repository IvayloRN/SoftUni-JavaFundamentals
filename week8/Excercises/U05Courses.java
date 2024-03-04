package javaFundamentals.week8.Excercises;

import java.util.*;

public class U05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> totalInfo = new LinkedHashMap<>();
        while (!input.equals("end")){
            String courses = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if (!totalInfo.containsKey(courses)) {
                totalInfo.put(courses, new ArrayList<>());
            }
                totalInfo.get(courses).add(studentName);
            input = scanner.nextLine();
        }
        totalInfo.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(student -> System.out.println("-- " + student));
        });
    }
}
