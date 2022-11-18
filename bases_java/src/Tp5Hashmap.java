import java.util.ArrayList;
import java.util.Scanner;

public class Tp5Hashmap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> languages =new ArrayList<>();
        ArrayList<String> languagesAvant =new ArrayList<>();
        System.out.println("Donnez le nombre de languages : ");
        int size = input.nextInt();
        input.nextLine();


        for (int i=0;i<size;i++){
            System.out.printf("Donnez le language numéro %d ",i+1);
            String userInput=input.nextLine();

            languages.add(userInput);
           languagesAvant.add(userInput);
        }



        System.out.println("donnez le nombre de languages à retirer :");
        int newSize= input.nextInt();
        input.nextLine();



        for(int j=0; j<newSize;j++){

            System.out.printf("Donnez le language numéro %d ", j+1);
            String userInput= input.nextLine();

            languages.remove(userInput);
        }
        System.out.println(languagesAvant);
        System.out.println(languages);
    }
}
