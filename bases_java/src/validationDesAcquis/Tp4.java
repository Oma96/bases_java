package validationDesAcquis;

import java.util.Scanner;

public class Tp4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Entrez une phrase");
        var phrase= input.nextLine();
        char[] arr = phrase.toCharArray();

        for(int i=0; i<arr.length;i++){
            arr[0]= Character.toUpperCase(arr[0]);
            if(arr[i]==' '){
                arr[i+1] = Character.toUpperCase(arr[i+1]);


            }
        }
        System.out.println(arr);
    }
}
