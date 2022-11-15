public class Tp11 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println("Le table de " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "*" + i + "=" + j * i);
            }
        }
    }
}
