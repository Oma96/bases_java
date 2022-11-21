package fondamentaux;

import java.util.Random;
import java.util.Scanner;

public class Tp55 {
    public static void main(String[] args) {
        Random obj = new Random();
        int nbr = obj.nextInt(100);
        System.out.println(nbr);
        int nbrAdeviner;
        do {
            Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Devinez le nombre : ");
            nbrAdeviner = keyboardInput.nextInt();
            if (nbrAdeviner == nbr) {
                System.out.println("Bravo!");
                break;
            }
            if (nbrAdeviner > nbr) {
                System.out.println("Entrez un nombre plus petit");
            } else {
                System.out.println("Entrez un nombre plus grand");
            }
        }
        while (nbrAdeviner != nbr);


    }
}
