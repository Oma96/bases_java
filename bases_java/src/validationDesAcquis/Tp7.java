package validationDesAcquis;

import java.util.Arrays;

public class Tp7 {
    public static void main(String[] args) {
        char [] monTableau = {'a','b','c','c','d','e'};


        for (int i=0; i< monTableau.length;i=i+2){
            monTableau[i]= Character.toUpperCase(monTableau[i]);
        }
        System.out.println(Arrays.toString(monTableau));
    }
}
