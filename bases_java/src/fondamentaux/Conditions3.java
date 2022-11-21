package fondamentaux;

import java.util.Scanner;
public class Conditions3 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez sélectionner une langue : ");
        String langue=keyboardInput.nextLine();//ANGLAIS
//        System.out.println(langue);
        langue=langue.toLowerCase();
//        System.out.println(langue);
        if(langue.equals("français")){
            System.out.println("Bonjour!");
        }else if(langue.equals("anglais")) {
            System.out.println("Hello!");
        } else if (langue.equals("allemand")) {
            System.out.println("Guten tag");
        } else if (langue.equals("espagnol")) {
            System.out.println("Holla!!");
        }else{
            System.out.println("Langue non supportée.");
        }
    }
}
