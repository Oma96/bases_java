package validationDesAcquis;

import java.util.Scanner;

public class Tp9 {




    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Donnez un mot");
        String maMethode= input.nextLine();
        boolean trueOrfalse= false;
        for (int j=0;j<maMethode.length()-1;j++){
            if (maMethode.charAt(j)==maMethode.charAt(j+1)){
                 trueOrfalse= true;
                break;
            }

        } System.out.println(trueOrfalse);
    }
}
