
public class Day25 {

    public static void main(String[] args) {

        int bilangan1 = 10;
        int bilangan2 = 5;
        int bilangan3 = 20;

        int terbesar = bilangan1;

        if (bilangan2 > terbesar) {
            terbesar = bilangan2;
        }

        if (bilangan3 > terbesar) {
            terbesar = bilangan3;
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
