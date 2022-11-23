package validationDesAcquis;

import java.util.Scanner;

public class Tp2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nombre = input.nextInt();

        int resultat =0;
        int nombreTemporaire=0;

        while (nombre>0){      //23//2//0
            nombreTemporaire= nombre%10;// 23%10=3 //2%10=2
            resultat= resultat*10 +nombreTemporaire;//0+3=3// 3*10 + 2=32
            nombre=nombre/10;// 2//2/10=0
        }
        System.out.println(resultat);
    }
}
