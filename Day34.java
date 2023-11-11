
public class Day34 {

    public static void main(String[] args) {

        int ganjil = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                ganjil++;
            }
        }
        System.out.println("Jumlah bilangan ganjil dari 1 hingga 100 adalah " + ganjil);
    }
}
