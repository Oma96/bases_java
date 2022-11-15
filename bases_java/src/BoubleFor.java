public class BoubleFor {
    public static void main(String[] args) {
        //         DRY Don't repeat yourself
//        System.out.printf("Le carré de 2 est %.1f\n",Math.pow(2,2));
//        System.out.printf("Le carré de 3 est %.1f\n",Math.pow(3,2));
//        System.out.printf("Le carré de 4 est %.1f\n",Math.pow(4,2));
//        System.out.printf("Le carré de 5 est %.1f\n",Math.pow(5,2));
//        System.out.printf("Le carré de 6 est %.1f\n",Math.pow(6,2));
//        System.out.printf("Le carré de 7 est %.1f\n",Math.pow(7,2));
//        System.out.printf("Le carré de 8 est %.1f\n",Math.pow(8,2));
//        System.out.printf("Le carré de 9 est %.1f\n",Math.pow(9,2));
//        System.out.printf("Le carré de 10 est %.1f\n",Math.pow(10,2));

//        Les nombres évoluent de 2 à 10 avec un pas de 1
//        On sait quand s'arrêter
        for(int nombre=2;nombre<=10;nombre++){
            System.out.printf("Le carre %d est %.1f\n",nombre,Math.pow(nombre,2));
        }
    }
}
