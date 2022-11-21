package poo;

public class test {


    public static void main(String[] args) {

       Souris souris1= new Souris(50,"blanche");
       Souris souris2 = new Souris(45,"grise");
       Souris souris3 = new Souris(souris2);

        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris3);

        souris1.evolue();
        souris2.evolue();
        souris3.evolue();

        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris3);
        //Rectangle rect= new Rectangle(400,350);
        //Rectangle rect2= new Rectangle(rect);
        //rect.longueur=250.5;
        //rect.largeur=120.7;
        //System.out.println(rect.getLongueur());
        //System.out.println(rect.getLargeur());
        //rect.setLongueur(250);
        //rect.setLargeur(120);
        //System.out.println(rect.getLongueur());
        //System.out.println(rect.getLargeur());
        //System.out.printf("Surface : %.1f\n",rect.calculSurface());
        //System.out.printf("Perimetre : %.1f\n",rect.calculPerimetre());

       //Patient patient = new Patient(55,1.64);
        //pat.setTaille(1.64);
        //pat.setPoids(55);

        //System.out.printf("la taille du patient : %.1f m\n ", patient.getTaille());
        //System.out.printf("le poids du patient : %.1f kg\n ", patient.getPoids());
        //System.out.printf("l'IMC du patient :  %.1f", patient.calculImc());


    }
}
