package fondamentaux;

import java.util.Scanner;

public class TableauStatique {
    public static void main(String[] args) {
//        String str=null;
        //  double notesCoursPhysique[]=new double[5];
//        Mauvaise : N'utilise une boucle for
//        System.out.println(notesCoursPhysique[0]);
//        System.out.println(notesCoursPhysique[1]);
//        System.out.println(notesCoursPhysique[2]);
//        System.out.println(notesCoursPhysique[3]);
//        System.out.println(notesCoursPhysique[4]);

        // 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
//        - La valeur doit toujours être > 0

        Scanner keybpardInput = new Scanner(System.in);
        //System.out.println("Définir le nombres des notes à stocker");
        int taille;
        do {
            System.out.println("Définir le nombres des notes à stocker");
            taille = keybpardInput.nextInt();
        } while (taille <= 0);
        double notesCours[] = new double[taille];
        // 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
        //        - Les valeurs ne doivent être qu'entre 0 et 20
        // 3. Calculer et afficher la moyenne
        double somme = 0;
        double moyenne = 0;
        for (int i = 0; i <= notesCours.length - 1; i++) {
            do {
                System.out.println("Entrez la valeur " + (i + 1) + " entre 0 et 20 : ");
                notesCours[i] = keybpardInput.nextDouble();
            } while (notesCours[i] < 0 || notesCours[i] > 20);
            somme = somme + notesCours[i];
        }
        moyenne = somme / taille;
        System.out.println("la moyenne est :" + moyenne);





        //notesCoursPhysique[0]=12.5;
        //notesCoursPhysique[1]=15;
        //notesCoursPhysique[2]=17;
        //notesCoursPhysique[3]=8;
        //notesCoursPhysique[4]=11;


//        calcul de la somme des notes
        //double somme=0;
        // for(int i=0;i<notesCoursPhysique.length;i++){
        //Pour i=0 : somme = 0 + 12.5 = 12.5
        // Pour i=1 : somme = 12.5 + 15 = 27.5
        // Pour i=2 : somme = 27.5 + 17 = 44.5
        // Pour i=3 : somme = 44.5 + 8 = 52.5
        // Pour i=4 : somme = 52.5 + 11 = 63.5
        //


        //
    }
}
