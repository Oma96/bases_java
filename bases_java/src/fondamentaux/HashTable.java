package fondamentaux;

import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        HashMap <String,String> identite= new HashMap<>(); // les cles sont string et valeur c'est string
        identite.put("nom","Jarraya");  // cle= nom, valeur= jarraya
        identite.put("prenom","Oumaima");
        identite.put("pays","Tunisie");
        System.out.println(identite);
        System.out.println(identite.get("prenom"));
    }
}
