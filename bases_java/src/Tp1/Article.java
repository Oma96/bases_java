package Tp1;

import java.util.ArrayList;

public class Article {
    private int numReference;
    private String nom;
    private int prixDeVente;
    private int quantiteEnStock;



    public Article(int numReference, String nom, int prixDeVente,int quantiteEnStock) {
        this.numReference = numReference;
        this.nom = nom;
        this.prixDeVente = prixDeVente;
        this.quantiteEnStock = quantiteEnStock;
    }

    public Article() {
    }

    public int getNumReference() {
        return numReference;
    }

    public String getNom() {
        return nom;
    }

    public int getPrixDeVente() {
        return prixDeVente;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }


    public void setNumReference(int numReference) {
        this.numReference = numReference;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrixDeVente(int prixDeVente) {
        this.prixDeVente = prixDeVente;
    }

    public void setQuantiteEnStock(int  quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }


    @Override
    public String toString() {
        return "Article{" +
                "numReference=" + numReference +
                ", nom='" + nom + '\'' +
                ", prixDeVente=" + prixDeVente +
                ", quantiteEnStock=" + quantiteEnStock +
                '}';



    }
}
