import java.util.Arrays;

public class Tp3Fonctions {

    public static int[] finalPosition(String[] array) {
        int x = 0;
        int y = 0;

        for (String direction : array) {
            switch (direction) {

                case "haut":
                    y += 1;
                    break;

                case "bas":
                    y -= 1;
                    break;

                case "gauche":
                    x -= 1;
                    break;
                case "droite":
                    x += 1;

                default:
                    break;
            }
        }

        int[] resultat = {x, y};
        return resultat;
    }

    public static void main(String[] args) {
        String[] tableau = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.println(Arrays.toString(finalPosition(tableau)));
    }
}
