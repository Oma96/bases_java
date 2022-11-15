
import java.util.Scanner;
public class Tp3 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);
        System.out.println("Saisir la premiere valeur : ");
        int valeur1= keyboardInput.nextInt();
        System.out.println("Saisir la deuxieme valeur : ");
        int valeur2= keyboardInput.nextInt();
        System.out.println("Saisir la troisieme valeur : ");
        int valeur3= keyboardInput.nextInt();
        int valeur2m = valeur2;
         valeur2= valeur1;
         valeur1= valeur3;
         valeur3=valeur2m;

        System.out.println(valeur1);
        System.out.println(valeur2);
        System.out.println(valeur3);

    }
}
