package heritage;

public class MainJeux {
    public static void main(String[] args) {
        var chris=new Guerrier("Christian Lisangola",100,"AK-47");
        var marie=new Magicien("Marie Bocage",150,"Marie Guette");
        var abdelali=new Sorcier("Abdelali Akhyat",200,"Baguette Abdel","Baton Abdel");
        // la classe personnage existe que pour géneraliser les caractéristiques
        //partagées enre le guerrier ,magicien,sorcier
        //var thomas = new Personnage("Thomas Rust",100);

        chris.presentation();
        marie.presentation();
        abdelali.presentation();
    }
}
