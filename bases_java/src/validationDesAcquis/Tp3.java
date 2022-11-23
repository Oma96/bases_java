package validationDesAcquis;

import java.util.HashMap;
import java.util.Scanner;

public class Tp3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Saissisez le mot 1");
        String mot1= input.nextLine();

        System.out.println("Saissisez le mot 2");
        String mot2 = input.nextLine();


        if (mot2.length() != mot1.length()) {
            System.out.println("Pas anagrammes");
        }

        HashMap<Character,Integer> mot1Table= new HashMap<>();

        for(char c:mot1.toCharArray()){
            mot1Table.put(c,mot1Table.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> mot2Table= new HashMap<>();

        for(char c:mot2.toCharArray()){
            mot2Table.put(c,mot2Table.getOrDefault(c,0)+1);
        }
        if(mot1Table.equals(mot2Table)){
            System.out.println("Ce sont des annagrammes");
        }

    }
}
