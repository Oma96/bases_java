package Tp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

    private ArrayList<Article> stock;


    public Stock(ArrayList<Article> stock) {
        this.stock = stock;
    }

    public ArrayList<Article> getStock() {
        return stock;
    }

   //rechercher article par reference // je peux utiliser une hashmap pour chercher l'article
    public Article getArticleByReference(int numeroReference) {
        Article article= new Article();
        for(int i=0;i< stock.size();i++){
            if(numeroReference==stock.get(i).getNumReference()){
                article= stock.get(i);
            }
        } return article;
    }
//Ajouter un article au stock en vérifiant l’unicité de la référence.

    public void addArticleToStock(Article article) {
       // if (getArticleByReference(article.getNumReference()) == 0) {
            stock.add(article);
        //}
    }
    //supprimer un article par reference
        public void  removeArticle(int numeroreference){
             this.stock.remove(getArticleByReference(numeroreference));
        }
   //modifier un article
        public void modifyArticle (Article article){

            for(int i=0;i< stock.size();i++){
                if(article.getNumReference()==stock.get(i).getNumReference()){
                    stock.set(i,article);
                }

            }

    }
    //modifier un article par reference

//    public void modifyArticleByReference (int referenceArtcile){
//
//
//        for(int i=0;i< stock.size();i++){
//            if(referenceArtcile==stock.get(i).getNumReference()){
//                Scanner input = new Scanner(System.in);
//                System.out.println("Donner le nouveau nom de l'article");
//                String nouveuNom = input.nextLine();
//
//                stock.get(i).setNom(nouveuNom);
//
//                System.out.println("Donner le nouveau prix de l'article");
//                int nouveauPrix = input.nextInt();
//
//                stock.get(i).setPrixDeVente(nouveauPrix);
//
//                System.out.println("Donner le nouveau prix de l'article");
//                int nouvelleQuantite = input.nextInt();
//
//                stock.get(i).setQuantiteEnStock(nouvelleQuantite);
//
//            }
//
//            }
//
//        }

// rechercher un article par nom

            public Article getArticleByName(String name) {
        Article article= new Article();
        for(int i=0;i< stock.size();i++){
            if(name.equals(stock.get(i).getNom())){
                article= stock.get(i);
            }
        } return article;
    }

// rechercher un article par intervalle de prix

    public ArrayList<Article> rechercherParIntervalle(int prixMin,int prixMax){

        ArrayList<Article> listeArticles =  new ArrayList<Article>();

        for(int i=0;i< stock.size();i++){
            if(stock.get(i).getPrixDeVente()>prixMin && stock.get(i).getPrixDeVente()<prixMax){
                listeArticles.add(stock.get(i));
            }
        }
        return listeArticles;

    }




}
