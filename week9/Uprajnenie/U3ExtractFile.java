package javaFundamentals.week9.Uprajnenie;

import java.util.Scanner;

public class U3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split("\\\\");
        String lastWord = items[items.length - 1];
        String fileName = lastWord.split("\\.")[0];
        String fileType = lastWord.split("\\.")[1];
        System.out.printf("File name: %s\n",fileName);
        System.out.printf("File extension: %s",fileType);

        //File name: Template
        //File extension: pptx
    }
}
