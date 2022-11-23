package validationDesAcquis;

import java.util.ArrayList;

public class Tp10 {
    public static ArrayList<String> maMethode(int[] tab, int somme) {
        ArrayList<String> tabSortie=new ArrayList<>();
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if ((tab[i] + tab[j]) == somme) {
                    tabSortie.add("[" + tab[i] + "," + tab[j] + "]");
                }
            }
        }
        return tabSortie;
    }
}
