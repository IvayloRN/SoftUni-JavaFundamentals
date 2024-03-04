package javaFundamentals.FinalExamPrep.PersonalPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> songComposer = new LinkedHashMap<>();
        Map<String, String> songKey = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String song = input[0];
            String composer = input[1];
            String key = input[2];
            songComposer.put(song,composer);
            songKey.put(song,key);
        }
        String comands = scanner.nextLine();

        while (!comands.equals("Stop")){
            String[] myArray = comands.split("\\|");
            String comand = myArray[0];
            String song = myArray[1];
            switch (comand){
                case"Add":
                    String composerToAdd = myArray[2];
                    String keyToAdd = myArray[3];
                    if (songKey.containsKey(song)){
                        System.out.printf("%s is already in the collection!\n",song);
                    }else{
                        songKey.put(song,keyToAdd);
                        songComposer.put(song,composerToAdd);
                        System.out.printf("%s by %s in %s added to the collection!\n",song,composerToAdd,keyToAdd);
                    }

                    break;
                case"Remove":
                    if (songKey.containsKey(song)){
                        songKey.remove(song);
                        songComposer.remove(song);
                        System.out.printf("Successfully removed %s!\n",song);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",song);
                    }

                    break;
                case"ChangeKey":
                    String newKey = myArray[2];
                    if (songKey.containsKey(song)) {
                        songKey.put(song,newKey);
                        System.out.printf("Changed the key of %s to %s!\n",song,newKey);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",song);
                    }
                    break;
            }

            comands = scanner.nextLine();
        }
//Upon receiving the "Stop" command, you need to print all pieces in your collection in the following format:
//"{Piece} -> Composer: {composer}, Key: {key}"
        songComposer.entrySet().forEach(e->{
            String song = e.getKey();
            String composer = e.getValue();
            String key = songKey.get(song);
            System.out.printf("%s -> Composer: %s, Key: %s\n",song,composer,key);
        });

    }
}
