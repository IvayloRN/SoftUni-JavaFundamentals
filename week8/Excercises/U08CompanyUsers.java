package javaFundamentals.week8.Excercises;

import java.util.*;

public class U08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        while (!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String employeeID = input.split(" -> ")[1];
            if (companyEmployees.containsKey(companyName)){
                if (!companyEmployees.get(companyName).contains(employeeID)){
                    companyEmployees.get(companyName).add(employeeID);
                }

            }else{
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeID);
            }
            input = scanner.nextLine();
        }
        companyEmployees.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });

    }
}