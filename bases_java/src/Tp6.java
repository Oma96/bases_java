import java.util.Locale;
import java.util.Scanner;
public class Tp6 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Saisir a : ");
        double a =keyboardInput.nextDouble();
        System.out.println("Saisir b : ");
        double b =keyboardInput.nextDouble();
        System.out.println("Saisir c : ");
        double c =keyboardInput.nextDouble();
        double delta= (b*b)-(4*a*c);
        System.out.println(delta);
        if(delta<0){
            System.out.println("pas de solution");
        } else if (delta==0) {
            System.out.println("la solution est: "+ -(b/2*a));
        } else if (delta>0) {
            System.out.println("les solutions sont:"+(-b-Math.sqrt(delta))/(2*a) +" et "+ (-b+Math.sqrt(delta))/(2*a) ) ;
        }

    }
}

