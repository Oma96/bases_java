package Tp2;

public class Maison extends Batiment {

    private int NbPieces;


    public Maison(String adresse, int nbPieces) {
        super(adresse);
        NbPieces = nbPieces;
    }

    public Maison(){

    }

    public int getNbPieces() {
        return NbPieces;
    }

    public void setNbPieces(int nbPieces) {
        NbPieces = nbPieces;
    }


    @Override
    public String toString() {
        return "Maison{" +
                "NbPieces=" + NbPieces +
                '}';
    }
}
