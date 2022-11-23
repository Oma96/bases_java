package validationDesAcquis;

import java.util.*;

public class Tp5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une phrase");
        String phraseDoublons = input.nextLine();
         StringBuilder sb= new StringBuilder();
        HashMap<String, Integer> motRepetes = new HashMap<>();
        for (String mot : phraseDoublons.split(" ")) {
            motRepetes.put(mot, motRepetes.getOrDefault(mot, 0) + 1);
            motRepetes.replace(mot,1);

        }
        for (Map.Entry mapEntry  : motRepetes.entrySet()) {
            sb.append(mapEntry.getKey());

        }
        System.out.println(sb);
        }
}
