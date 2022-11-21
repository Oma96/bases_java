package heritage;

public class Guerrier extends Personnage {
    private String arme;

    public Guerrier(String name, int dureeDeVie, String arme) {
        super(name,dureeDeVie); // on appelle le constructeur parent
       // this.name = name;
        // this.dureeDeVie = dureeDeVie;
        this.arme = arme;
    }



    public String getArme() {
        return arme;
    }

    public void setArme(String arme){
        this.arme = arme;
    }
    // polymorphisme de redéfinition: une methode qui existe dans la classe parent et elle a ete redefini dans la classe guerrier

   public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un guerrier\n", this.getName());
    }


}
