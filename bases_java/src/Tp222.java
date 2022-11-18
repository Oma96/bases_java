import java.util.Scanner;

public class Tp222 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Entrez la taille du tableau : ");
        int length = keyboardInput.nextInt();
        int tab[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Entrez l'element " + (i + 1) + " du tableau :");
            tab[i] = keyboardInput.nextInt();
        }
        System.out.println("Choissisez un nombre");
        int nombreAcomparer = keyboardInput.nextInt();
        int occurence = 0;
        for (int nombre : tab) {
            if (nombre == nombreAcomparer) {
                occurence++;
            }
        }
        if (occurence!=0){
            System.out.printf("le nombre %d existe %d fois", nombreAcomparer, occurence);
        } else {
            System.out.printf("le nombre %d n'existe pas dans le tableau", nombreAcomparer);
        }

    }
}
