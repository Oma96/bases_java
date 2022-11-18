public class Tp111 {
    public static void main(String[] args) {
        int tab[] = {2, 7, 5, 2, 2, 2, 1, 2, 2, 1, 7, 7, 7, 7, 7, 7};

        int nombreLePlusFrequent=0;
        int occurenceMax=0;

        for (int i=0;i<tab.length;i++) {
            int occcurence=0;
            for (int j=0; j< tab.length;j++) {
                if (tab[i] == tab[j]) {
                    occcurence= occcurence+1;
                    }
            }
               if(occcurence>occurenceMax){
                   occurenceMax=occcurence;
                   nombreLePlusFrequent=tab[i];
               }


        }
        System.out.println("L’élément le plus fréquent est le "+nombreLePlusFrequent +" avec "+ occurenceMax +" apparitions");
    }}

