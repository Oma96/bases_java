
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.println("Après quelques minutes, l'appareil s'est verrouillé...");
        int codePinATester;
        do{//a tester = 1111, codePin=1111
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester=keyboardInput.nextInt();// 1111
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