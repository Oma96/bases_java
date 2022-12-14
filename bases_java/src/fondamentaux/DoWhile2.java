package fondamentaux;

import java.util.Scanner;
public class DoWhile2 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.println("Après quelques minutes, l'appareil s'est verrouillé...");
        int codePinATester;
        int nombreTentatives=0;
        do{
            if(nombreTentatives>=2){
                System.out.printf("Il vous reste %d tentatives.",(5-nombreTentatives));
            }
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester=keyboardInput.nextInt();
            nombreTentatives++;
            if(codePinATester!=codePin){
                if(nombreTentatives==5){
                    System.out.printf("Vous avez saisi %d fois des mauvais codes.Votre " +
                            "appareil est bloqué\n",nombreTentatives);
                    break;

                }
                System.out.println("Code PIN incorrect.Veuillez recommencer.");
                continue;// les instructions dans la boucle qui viennent apres continue ne va pas s'executer
            }
            System.out.println("Félicitations, appareil déverrouillé....");
            break;
        } while (true);
    }
}
