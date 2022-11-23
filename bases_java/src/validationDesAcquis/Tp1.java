package validationDesAcquis;

import java.util.Arrays;

public class Tp1 {
    public static void main(String[] args) {
        int [] tableau= {5,8,0,9,2};
        System.out.println(Arrays.toString(tableau));
        int max=0;
        int min=0;
        for(int i=0; i<tableau.length;i++){
            if(tableau[i]>max){
                max= tableau[i];
            }else if (tableau[i]<min){
                min=tableau[i];
            }
        }

        System.out.println("Le plus grand est "+ max);
        System.out.println("Le plus petit est "+ min);
    }
}
