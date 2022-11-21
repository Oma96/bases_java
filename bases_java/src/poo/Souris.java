package poo;

public class Souris {

    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

    final int ESPERANCE_VIE_DEFAULT= 36;

    // constructeur avec parametres
    //public Souris(int poids, String couleur, int age) {
      //  this.poids = poids;
        //this.couleur = couleur;
        //this.age = age;
        //this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        //System.out.println("Une nouvelle souris");
   // }

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        esperanceVie=ESPERANCE_VIE_DEFAULT;
        age=0;
        System.out.println("Une nouvelle souris");

    }
    // constructeur de copie

    public Souris(Souris souris){
        this.poids = souris.poids;
        this.couleur = souris.couleur;
        this.age = souris.age;
        this.esperanceVie = (souris.esperanceVie*4)/5;
        this.clonee=true;
        System.out.println("Clonage d'une souris");
    }

    public String toString(){
        if(!clonee) {
            return String.format("Une souris %s de %d mois et pesant %d grammes", couleur, age, poids);
        }else{
            return String.format("Une souris %s clonée de %d mois et pesant %d grammes", couleur, age, poids);
        }
    }



    public void vieillir(){
        age++;

        if(clonee) {
            if (age > (esperanceVie / 2)) {
                couleur = "verte";
            }
        }

  }
  public void evolue(){
      do {
          vieillir();
      }while (age<esperanceVie);
    }














}
