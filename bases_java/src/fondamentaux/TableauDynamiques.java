package fondamentaux;

import java.util.ArrayList;

public class TableauDynamiques {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        System.out.printf("Taille du tableau : %d\n",fruits.size());
        fruits.add("Pommes");// -> 0
        fruits.add("Bananes");// -> 1
        fruits.add("Oranges");// -> 2
        System.out.printf("Taille du tableau après ajouts : %d\n",fruits.size());
        System.out.println(fruits);
        fruits.remove(0);
        System.out.printf("Taille du tableau après suppression : %d\n",fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.get(0));


        //        Tableau des tableaux
//        Peut être utilisé pour créer des matrices
       // ArrayList<ArrayList<Integer>> matrice=new ArrayList<>()
    }
}
