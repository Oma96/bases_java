import java.util.Scanner;

public class Tp33 {


    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Veuillez entrer votre email : ");
        String email = keyboardInput.nextLine();
        System.out.println("Veuillez entrer votre mot de passe: ");
        String mdp = keyboardInput.nextLine();


        String emailATester;
        String mdpAtester;
        int i = 0;
        do {
            System.out.println("Veuillez entrer l'email : ");
            emailATester = keyboardInput.nextLine();

            System.out.println("Veuillez entrer le mot de passe : ");
            mdpAtester = keyboardInput.nextLine();

            if (!emailATester.equals(email) || !mdpAtester.equals(mdp) ) {

                System.out.println("veuillez recommencez");
                i++;
                if (i >= 5) {
                    System.out.println("votre compte est bloqué");
                    break;
                 }continue;
               }System.out.println("correct");


        } while (true);

    }
}

