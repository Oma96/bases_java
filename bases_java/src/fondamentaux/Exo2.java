package fondamentaux;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[]args){
        Scanner keyboardInput= new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom= keyboardInput.nextLine();
        System.out.print("Entrez votre prenom : ");
        String prenom= keyboardInput.nextLine();
        System.out.print("Entrez votre age : ");
        int age= keyboardInput.nextInt();
        System.out.print("Entrez votre poids : ");
        double poids= keyboardInput.nextDouble();
        System.out.printf("Nom : %s\nPrénom : %s\nAge : %d ans"+
                "\nPoids : %f kg",nom,prenom,age,poids);



    }
}
