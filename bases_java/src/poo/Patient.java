package poo;

public class Patient {

    private double poids;
    private double taille;
    public Patient(double poids,double taille){
        this.poids= poids;
        this.taille= taille;
    }

    public double getPoids(){
        return poids;
    }
    public double getTaille(){
        return taille;
    }

    public void  setPoids(double poids) {
        if (poids > 0) {
            this.poids = poids;
        } else{
            System.out.println("le poids doit etre positive");
        }
    }
    public void  setTaille(double taille){
        if(taille>0){
        this.taille=taille;
       }else{
            System.out.println("la taille doit etre positive");
        }
    }
    public double calculImc(){
        return (poids/(taille*taille));

    }

}
