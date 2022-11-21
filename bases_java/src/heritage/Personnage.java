package heritage;

public abstract class Personnage {
    private String name;
    private int dureeDeVie;

    public Personnage(String name, int dureeDeVie) {
        this.name = name;
        this.dureeDeVie = dureeDeVie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    //public void presentation(){
      //  System.out.printf("Mon nom est %s, et je suis un personnage\n", this.name);
    //}
    // si la classe guerrier n'implemente pas presentation on aura un erreur
    // si une methote abstract (pas besoin d'avoir un corps dans la classe parent)
    // mais tout les classes enfants sont obligees de fournir un corps a la methode personnage
    public abstract void presentation();

}
