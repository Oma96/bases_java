
import java.util.Locale;
import java.util.Scanner;
public class Tp5 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Saisir un nombre: ");
        double nombre = keyboardInput.nextDouble();
        if((nombre>0) & (nombre/2 == 0) ){
            System.out.println("le nombre est positif et pair");
        } else if ((nombre>0) & (nombre/2 != 0)) {
            System.out.println("le nombre est positif et impair");
        } else if ((nombre<0) & (nombre %2 == 0) ) {
            System.out.println("le nombre est negatif et pair");
        } else if ((nombre<0) & (nombre %2 != 0)) {
            System.out.println("le nombre est negatif et impair");
    }else System.out.println("le nombre est zéro" );
    }
}
