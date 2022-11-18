public class Tp2Fonctions {


    public static String repetedNumber(int[][]tab, int nombre){
        int occurence = 0;
        StringBuilder position =new StringBuilder();
        StringBuilder resultatFinal= new StringBuilder(String.valueOf(nombre)).append(" se retrouve ");

        for(int i=0;i< tab.length;i++){
            for (int j=0;j<tab[i].length;j++){


                if ((tab[i][j])==nombre){
                    occurence++;
                    position.append("(").append(i).append(",").append(j).append(")");
                }
            }
        }
        resultatFinal.append(occurence).append(" fois dans les emplacements suivants : ").append(position);
        return resultatFinal.toString() ;
    }




    public static void main(String[] args) {
        int [][]tab={
                {1, 4, 2, 1},
                {6, 3, 8, 9},
                {1, 5, 1, 0}
        };
        int nombre=1;
        System.out.println(repetedNumber(tab,nombre));

    }

}
