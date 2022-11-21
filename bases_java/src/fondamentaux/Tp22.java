package fondamentaux;

import java.util.Scanner;

public class Tp22 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = keyboardInput.nextInt();
        int f = 1;
        for (int i = 1; i <= nombre; i++) {
            f = f * i;
        }
        System.out.println("le factorielle est :" + f);

    }
}


