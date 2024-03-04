package javaFundamentals.week8.Excercises;

import java.util.*;

public class U06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String , List<Double>> studentInfo = new LinkedHashMap<>();

        for (int count = 1; count <= n; count++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (studentInfo.containsKey(studentName)){
                List<Double> currentGrades = studentInfo.get(studentName);
                currentGrades.add(grade);

            }else{
                studentInfo.put(studentName, new ArrayList<>());
                studentInfo.get(studentName).add(grade);
            }

        }
        Map<String , Double> studentAvarageGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry:studentInfo.entrySet()) {
            String studentName = entry.getKey();
            List<Double> gradeList = entry.getValue();
            double avarageGrade = getAverageGrade(gradeList);
            double average = gradeList.stream().mapToDouble(e -> e).average().orElse(0.0);
            if (avarageGrade >= 4.50){
                studentAvarageGrade.put(studentName, avarageGrade);
            }
        }
        studentAvarageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n", entry.getKey() , entry.getValue()));

    }

    private static double getAverageGrade(List<Double> gradeList) {
        double sum = 0;
        for (double grade: gradeList) {
            sum+=grade;
        }
        return sum / gradeList.size();
    }
}
