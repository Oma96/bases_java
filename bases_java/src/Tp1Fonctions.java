public class Tp1Fonctions {

    public static String formatStr(String str){
        String formatted=str.replaceAll("[^A-Za-z]","").toLowerCase();
        return formatted;
    }
    public static boolean isPrefix(String mot1, String mot2) {
        boolean result = mot1.startsWith(mot2);
        return result;
    }

    public static void main(String[] args){
        String mot1= "hugging";
        String mot2="hug";
        String formattedMot1= formatStr(mot1);
        String formattedMot2= formatStr(mot2);
    System.out.println(isPrefix(formattedMot1, formattedMot2));
    }


}
