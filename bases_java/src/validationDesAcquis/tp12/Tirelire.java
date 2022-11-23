package validationDesAcquis.tp12;

public class Tirelire {

    private double argent;


    public Tirelire(double argent) {
        this.argent = argent;
    }

    public Tirelire() {
    }

    public double getArgent() {
        return argent;
    }

    public void setArgent(double argent) {
        this.argent = argent;
    }

    public double getMontant(){
        return this.argent;
    }

    public void afficher() {
        if (argent != 0) {
            System.out.printf("Vous avez %f  dans votre tirelire\n ",this.getArgent());
        } else {
            System.out.printf("Vous etes sans le sou\n");
        }
    }
    public void secouer(){
        if(argent!=0){
            System.out.printf("Bing Bing!\n");
        }
    }

    public void remplir(double montant){
        if (montant>0){
            this.argent= argent+montant;
        }
    }
    public void vider(){
        setArgent(0);
    }
    public void puiser(double montant){
        if (montant<0){

        }
        if(montant> this.argent){
            vider();
        }
    }

    public double calculerSolde(double budget){
        if(budget<=0){
            return getArgent();
        } else{
            return this.argent-budget;
        }
    }





}
