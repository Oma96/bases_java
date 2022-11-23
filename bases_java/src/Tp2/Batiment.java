package Tp2;

public abstract class Batiment {
    private String adresse;

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public Batiment() {
    }

    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
