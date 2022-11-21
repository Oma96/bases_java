package fondamentaux;

import java.util.Locale;
import java.util.Scanner;
public class Tp1 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Saisir le diametre : ");
         double diametre =keyboardInput.nextDouble();
         double rayon= diametre/2;
         double surface= rayon*rayon* Math.PI;
        System.out.println("la surface est : "+ surface);
    }
}
