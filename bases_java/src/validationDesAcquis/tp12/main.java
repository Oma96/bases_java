package validationDesAcquis.tp12;

public class main {
    public static void main(String[] args) {
        Tirelire tir= new Tirelire();
        tir.afficher();
        tir.remplir(100);
        tir.secouer();
        tir.afficher();
        tir.remplir(200);
        tir.afficher();
        System.out.println(tir.calculerSolde(-100));



    }
}
