package heritage;

import java.util.ArrayList;

public class Guerrier extends Personnage implements EntiteVolante{
    //private Arme arme; // l'arme peut etre aussi une classe
    private ArrayList<Arme> armes;

    // des variables dont on a pas besoin dans cette classe ==> abstraction
    // par exemple: private String phoneNumber;
    //private String email;


    public Guerrier(String name, int dureeDeVie) {
        super(name,dureeDeVie); // on appelle le constructeur parent
       // this.name = name;
        // this.dureeDeVie = dureeDeVie;

    }
    public Guerrier(String name,int dureeDeVie,ArrayList<Arme> armes){
        this(name,dureeDeVie); // this va appeler le constructeur de cette classe
        this.armes=armes;
    }




    public ArrayList<Arme> getArmes() {
        return armes;
    }

    public void setArme(ArrayList <Arme>arme){
        this.armes = arme;
    }
    public void addArme(Arme arme){
        this.armes.add(arme);
    }

    // polymorphisme de redéfinition: une methode qui existe dans la classe parent et elle a ete redefini dans la classe guerrier

   public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un guerrier\n", this.getName());
    }
    public void voler(){
        System.out.println("I believe I can fly..");
    }


}
