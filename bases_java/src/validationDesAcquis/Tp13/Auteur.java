package validationDesAcquis.Tp13;

public class Auteur {
   private String nom;


   private boolean estPrime;


    public Auteur(String nom, boolean estPrime) {
        this.nom = nom;
        this.estPrime = estPrime;
    }


    public String getNom() {
        return nom;
    }

    public boolean getPrix() {
        if(!estPrime){
            return true;
        }
        return false;
    }




}
