package heritage;

import java.util.ArrayList;

public class MainJeux {
    public static void main(String[] args) {
        var m16= new Arme("M16","semi-automatique","Armalite",800);
        var ak47 =new Arme("AK-47","semi-automatique","kalashinkov",1300);
        ArrayList<Arme> mesArmes= new ArrayList<>();
        mesArmes.add(m16);
        mesArmes.add(ak47);
        var chris=new Guerrier("Christian Lisangola",100,mesArmes);
        var marie=new Magicien("Marie Bocage",150,"Marie Guette");
        var abdelali=new Sorcier("Abdelali Akhyat",200,"Baguette Abdel","Baton Abdel");
        // la classe personnage existe que pour géneraliser les caractéristiques
        //partagées enre le guerrier ,magicien,sorcier
        //var thomas = new Personnage("Thomas Rust",100);

        //chris.presentation();
        //marie.presentation();
        //abdelali.presentation();
        ArrayList<Personnage> personnages=new ArrayList<>();
        personnages.add(chris);
        personnages.add(marie);
        personnages.add(abdelali);

        for (int i=0;i<personnages.size();i++){
            System.out.println(personnages.get(i).getName());
        }

        // si on a 1000 objet ... c pas pratique
        //chris.voler();
        //abdelali.voler();
        // heureusement il existe l'interface et heritge multiple n'existe pas

        ArrayList<EntiteVolante> personnagesVolants= new ArrayList<>();
        personnagesVolants.add(chris);
        personnagesVolants.add(abdelali);

        for (int i=0;i<personnagesVolants.size();i++){
            personnagesVolants.get(i).voler();
        }

    }
}
