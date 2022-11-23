package validationDesAcquis.Tp13;

public class Exemplaire extends Oeuvre{

 private String exemplaire;
 private Oeuvre oeuvre;

    public Exemplaire(String titre, Auteur auteur, String langue, String exemplaire) {
        super(titre, auteur, langue);
        this.exemplaire = exemplaire;
    }


    public Oeuvre getOeuvre() {
        return oeuvre;
    }



}
