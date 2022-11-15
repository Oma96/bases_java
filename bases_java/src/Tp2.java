import java.util.Scanner;
import java.util.Locale;

public class Tp2 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Entrez votre nom : ");
        String nom= keyboardInput.nextLine();
        System.out.print("Entrez votre prenom : ");
        String prenom= keyboardInput.nextLine();
        System.out.print("Entrez votre age : ");
        int age= keyboardInput.nextInt();

        System.out.printf("Vous vous appelez %s %s et vous avez %d ans",nom,prenom,age);
    }
}
