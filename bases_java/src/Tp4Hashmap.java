import java.util.Scanner;

public class Tp4Hashmap {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.println("Saisir un texte");
        String texte= input.nextLine();

        StringBuilder texteToPrint=new StringBuilder();

        for (int i=texte.length();i>0;i--){ //texte

            texteToPrint.append(texte.charAt(i-1));
        }
        System.out.println(texteToPrint);
        if(texte.compareTo(texteToPrint.toString())==0){
            System.out.println("C'est un palindrome");
        }else {
            System.out.println("c'est pas un palindrome");
        }
    }
}
