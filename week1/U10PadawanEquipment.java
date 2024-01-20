package javaFundamentals.week1;

import java.util.Scanner;

public class U10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoneyAvailable = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightSabresCost = lightsabersPrice  * Math.ceil(countOfStudents + (countOfStudents * 0.10));
        double robesCost = (robesPrice * countOfStudents);
        double beltsCost = beltsPrice * (countOfStudents - (countOfStudents / 6));
        double totalCost = beltsCost + robesCost + lightSabresCost;
        if (amountMoneyAvailable >= totalCost){
            System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalCost - amountMoneyAvailable);
        }


    }
}
