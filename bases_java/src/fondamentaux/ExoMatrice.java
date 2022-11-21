package fondamentaux;

public class ExoMatrice {
    public static void main(String[] args) {
        int tab[][] = {
                {3, 4, 5},
                {1, 2, 6},
                {8, 5, 4}
        };
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i == j) {
                    d1 = d1 + tab[i][j];
                }
                if (i + j == tab.length - 1) {
                    d2 = d2 + tab[i][j];
                }
            }
        }
        int somme = d1 + d2;
        int diff = d1 - d2;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(somme);
        System.out.println(diff);

    }
}
