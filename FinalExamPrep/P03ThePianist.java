package javaFundamentals.FinalExamPrep;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String , String> composerByPiece = new LinkedHashMap<>();
        Map<String , String> keyByPiece = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\|");
            String piece = parts[0];
            String composer = parts[1];
            String key = parts[2];
            composerByPiece.put(piece, composer);
            keyByPiece.put(piece, key);

        }
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")){
            String[] commandParts = commands.split("\\|");
            String command = commandParts[0];

            switch (command){
                case "Add":
                    String piece = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];
                    if (composerByPiece.containsKey(piece)){
                        System.out.printf("%s is already in the collection!\n", piece);
                    }else{
                        composerByPiece.put(piece, composer);
                        keyByPiece.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece , composer, key);
                    }
                    break;
                case "Remove":
                    String pieceForRemove = commandParts[1];
                    if (composerByPiece.containsKey(pieceForRemove)){
                        composerByPiece.remove(pieceForRemove);
                        keyByPiece.remove(pieceForRemove);
                        System.out.printf("Successfully removed %s!\n", pieceForRemove);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", pieceForRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceForChange = commandParts[1];
                    String newKey = commandParts[2];
                    if (composerByPiece.containsKey(pieceForChange)){
                        keyByPiece.put(pieceForChange, newKey);
                        System.out.printf("Changed the key of %s to %s!\n",pieceForChange, newKey);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",pieceForChange);
                    }
                    break;
            }


             commands = scanner.nextLine();
        }
   /*     composerByPiece
                .entrySet()
                .stream()
                .sorted((e1, e2) ->{
                    int pieceNameSortResult = e1.getKey().compareTo(e2.getKey());
                    if (pieceNameSortResult != 0){
                        return pieceNameSortResult;
                    }
                    return e1.getValue().compareTo(e2.getValue());
                })
                .forEach(e->{
                    String piece = e.getKey();
                    String composer = e.getValue();
                    String key = keyByPiece.get(piece);
                    System.out.printf("%s -> Composer: %s, Key: %s\n", piece , composer, key);
                });*/
//"{Piece} -> Composer: {composer}, Key: {key}"
       for (String piece: composerByPiece.keySet()) {
           String composer = composerByPiece.get(piece);
           String key = keyByPiece.get(piece);
           System.out.printf("%s -> Composer: %s, Key: %s\n", piece, composer, key);
       }

    }
}
