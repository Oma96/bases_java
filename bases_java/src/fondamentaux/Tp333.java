package fondamentaux;

import java.util.Scanner;

public class Tp333 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int numeroTab = 1;
        StringBuilder tableau = new StringBuilder("");
        StringBuilder somme = new StringBuilder("S = ");
        int s = 0;

        do {
            System.out.printf("Entrez la taille du tableau numero %d : ", numeroTab);
            int length = keyboardInput.nextInt();
            int tab[] = new int[length];
            tableau.append("T").append(numeroTab).append(": [");

            for (int i = 0; i < length; i++) {
                System.out.printf("Entrez l'element %d du tableau %d :", i + 1, numeroTab);
                tab[i] = keyboardInput.nextInt();
                tableau.append(tab[i]);
                tableau.append(", ");
                if (tab[i] % 3 == 0) {
                    somme.append(tab[i]).append("+");
                    s += tab[i];
                }
            }
            //pour enlever les 2 derniers caracteres
            tableau.delete(tableau.length() - 2, tableau.length());
            tableau.append("]\n");
            numeroTab++;
        } while (numeroTab < 4);

        somme.replace(somme.length() - 1, somme.length(), "=").append(s);

        System.out.println(tableau);
        System.out.println(somme);


    }
}