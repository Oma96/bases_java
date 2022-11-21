package fondamentaux;

public class Main {
    public static void main(String[] args) {
        int age=26;// type identificateur=valeur;
        String nom="Jarraya";
        String prenom="Oumaima";
        double poids=54.5;
        String nomComplet="Sarah";//camel case
        int a425=56;// commencer tjrs par une lettre
        //ne pas commencer par des mots réservé par java
        //ne fait pas d'espace dans l'identificate
                  /*
                  commentaires
                  multilignes
                  */

        //System.out.println(age);// ecrire sout
        //System.out.println(nom);
        //System.out.println(prenom);
        //System.out.println(poids);

        //System.out.println("Je m'appelle "+prenom+" "+nom+", j'ai "+age+" ans et je pése "+poids+" kg");

        //ln dans println c'est pour retourner à la ligne
        System.out.printf("je m'appelle %s %s, j'ai %d ans et je pèse %.f kg\n",
                prenom, nom, age, poids);//souf
        System.out.printf("je m'appelle %s %s, j'ai %d ans et je pèse %.1f kg",
                prenom, nom, age, poids);// affichage avec arrondissement
        //.1f pour prendre 1 nombre apres la vergule, .2f pour 2 nombres etc..
        //   \n pour le retour en ligne dans printf
        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\nPoids : %f",nom,prenom,age,poids);





    }
}