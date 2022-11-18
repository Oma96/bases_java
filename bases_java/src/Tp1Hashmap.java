import java.util.HashMap;
import java.util.Scanner;

public class Tp1Hashmap {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.println("Saisir un texte");
        String texte= input.nextLine();
        HashMap<Character,Integer> occurences=new HashMap<>();
        System.out.println(texte);
        for(int i=0; i< texte.length();i++){
            if(occurences.containsKey(texte.charAt(i))){
                int nombreMisAJour= occurences.get(texte.charAt(i))+1;
                occurences.replace(texte.charAt(i),nombreMisAJour);
            }else{
                occurences.put(texte.charAt(i),1);
            }
        }
        System.out.println(occurences);
    }
}
