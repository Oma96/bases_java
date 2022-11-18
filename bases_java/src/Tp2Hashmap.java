import java.util.Scanner;

public class Tp2Hashmap {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.println("Saisir un texte");
        String texte= input.nextLine();

        StringBuilder texteToPrint=new StringBuilder();

        for (int i=texte.length();i>0;i--){

            texteToPrint.append(texte.charAt(i-1));

        }
        System.out.println(texteToPrint);
    }
}
