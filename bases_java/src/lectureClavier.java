

import java.util.Scanner;
public class lectureClavier {
    public static void main(String[]args){
        Scanner keyboardInput= new Scanner(System.in);
        System.out.print("Entrez la longueur : ");
        double longueur= keyboardInput.nextDouble();
        System.out.print("Entrez la largeur : ");
        double largeur= keyboardInput.nextDouble();
        double surface=longueur*largeur;
        double perimetre=2*(longueur+largeur);
        System.out.printf("longueur : %.1f m\nlargeur : %.1f m\nsurface : %.1f m2\npérimètre : %.1f m",longueur,largeur,surface,perimetre);
    }
}
