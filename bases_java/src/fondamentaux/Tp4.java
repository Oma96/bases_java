package fondamentaux;

import java.util.Locale;
import java.util.Scanner;
public class Tp4 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);
        System.out.println("Saisir votre age : ");
        int age= keyboardInput.nextInt();
        int anneeNaissance= 2022- age;
        System.out.println("votre annee de naissance : " + anneeNaissance);
    }
}
