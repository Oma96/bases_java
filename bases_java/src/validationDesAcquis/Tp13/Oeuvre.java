package validationDesAcquis.Tp13;

public abstract class Oeuvre {



    private String titre;
    private Auteur auteur;
    private String langue;


    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }

    public Oeuvre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = "Français";
    }

    public Oeuvre() {
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "titre='" + titre + '\'' +
                ", auteur=" + auteur +
                ", langue='" + langue + '\'' +
                '}';
    }
}
