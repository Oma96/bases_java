package fondamentaux;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.println("Après quelques minutes, l'appareil s'est verrouillé...");
        int codePinATester;
        int i = 0;
        do{//a tester = 1111, codePin=1111
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester=keyboardInput.nextInt();// 1111
            i++;
             if(i>=2){
               System.out.printf("il vous reste %d tentatives\n", 5-i);
             }
             if(i==5){
                 System.out.println("Vous avez saisi 5 fois des mauvais codes. Votre appareil est bloqué");
                 break;
             }
            if(codePinATester==codePin){//1111 == 1111 => true
                System.out.println("Félicitations, appareil déverrouillé....");
            }else{
                System.out.println("Code PIN incorrect.Veuillez recommencer.");
            }


        } while (codePinATester!=codePin);

    }
}



//while et do-while sont tous tanque (on sait pas le nombre d'iteration à l'avance)
//avec while la condition est testé avant
// avec do while la condition est executé au moins une fois