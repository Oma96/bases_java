package Tp1;

import java.util.ArrayList;

public class Program {


    public static void main(String[] args) {
        var article1= new Article(111,"Galaxy s22",500,1000);
        var article2= new Article(112,"Galaxy s22 pro",600,800);
         var article3 = new Article(113,"Galaxy s21",450,1200);
         var article4= new Article(114,"Galaxy s10",200,500);
       ArrayList<Article> mesArticles = new ArrayList<>();
       mesArticles.add(article1);
       mesArticles.add(article2);
       mesArticles.add(article3);

       var articleModifie = new Article(111,"Galaxy ",500,1000);

       var stock = new Stock(mesArticles);

       // rechercher un article par reference
        System.out.println(stock.getArticleByReference(113));

        //Ajouter un article au stock en vérifiant l’unicité de la référence.
         stock.addArticleToStock(article4);
        System.out.println(stock.getStock());
        //supprimer un article par reference
        //stock.removeArticle(111);

        // modifer un article par reference
        stock.modifyArticle(articleModifie);

        // rechercher un article par nom
        //System.out.println(stock.getArticleByName("Galaxy s21"));
        // rechercher un article par intervalle de prix
        //stock.rechercherParIntervalle(200,500);
        // afficher les articles
        //System.out.println(stock.getStock());






    }
}
