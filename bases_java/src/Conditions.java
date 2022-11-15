
import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);
        System.out.println("votre age : ");
        int age=keyboardInput.nextInt();

        //   >= : superieur ou egal
        //   <= : inferieur ou egal
        //        = = : Test d'égalité
        //        ! = : Test de différence



        if(age>=18){
            System.out.println("vous etes  majeur");
        }else{
            System.out.println("vous etes mineur");
        }
    }
}
