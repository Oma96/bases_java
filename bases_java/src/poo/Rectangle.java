package poo;

public class Rectangle {
    private double longueur;
    private double largeur;
    // un constructeur avec parametre
    public Rectangle(double longueur, double largeur){// longeur et largeur sont des parametres
        this.longueur=longueur;
        this.largeur=largeur;
    }
    //constructeur par defaut

    // la surcharge c'est d'avoir 2 methodes qui ont le meme nom comme rectangle (le polymorphisme)
    public Rectangle(){
        longueur=10;
        largeur=5;
    }
    //constructeur de copie
    public Rectangle(Rectangle rectangle){
        this.longueur= rectangle.longueur;
        this.largeur= rectangle.largeur;
    }
    //getters : (accesseurs) methode pour acceder aux attributs
    public double getLongueur() {
        return longueur; // c'est celui de l'attribut
    }

    public double getLargeur() {
        return largeur;
    }

    //setters :  (manipulateurs)methode pour modifier des attriburs
    // void: methode veut dire que ne retourne rien
    public void setLongueur(double longueur) {
        if (longueur > 0) {

            this.longueur = longueur;// this.longueur c'est l'attribut et longueur c le parametre
        } else {
            System.out.println("la longueur doit etre positive");
        }
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
             this.largeur = largeur;
        } else {
            System.out.println("la largeur doit etre positive");
        }
    }
    public double calculSurface() {
        return longueur * largeur;
    }

    public double calculPerimetre() {
        return 2 * (longueur + largeur);
    }


    public String toString(){
        return String.format("Longueur : %.2f\nLargeur : %.2f",longueur,largeur);
    }

}