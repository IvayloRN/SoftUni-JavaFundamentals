package javaFundamentals.week7.U04Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Students student = new Students(firstName, lastName, grade);
            studentList.add(student);
        }
        Collections.sort(studentList, Comparator.comparingDouble(Students::getGrade).reversed());
        for (Students student: studentList) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName() , student.getLastName() , student.getGrade());
        }
    }
}
