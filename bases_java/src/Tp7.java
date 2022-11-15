
import java.util.Scanner;
public class Tp7 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Saisir une valeur entre 1 et 12 : ");
        int valeur = keyboardInput.nextInt();
        if (valeur == 1) {
            System.out.println("janvier");
        } else if (valeur == 2) {
            System.out.println("fevrier");
        }
        else if (valeur == 3) {
            System.out.println("mars");
        } else if (valeur == 4) {
            System.out.println("avril");
        } else if (valeur == 5) {
            System.out.println("mai");
        } else if (valeur == 6) {
            System.out.println("juin");
        } else if (valeur == 7) {
            System.out.println("juillet");
        } else if (valeur == 8) {
            System.out.println("aout");
        } else if (valeur == 9) {
            System.out.println("septembre");
        } else if (valeur == 10) {
            System.out.println("octobre");
        } else if (valeur == 11) {
            System.out.println("novembre");
        } else if (valeur == 12) {
            System.out.println("decembre");
        }
    }
}
