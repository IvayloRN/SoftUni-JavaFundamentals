package javaFundamentals.week4;

import java.util.Scanner;

public class U07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        matrix(n);

    }
    public static void  matrix(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int columns = 0; columns < n; columns++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }

}
