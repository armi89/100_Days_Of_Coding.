
import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bilangan_1;
        int bilangan_2;
        int bilangan_3;
        System.out.print("Masukkan bilangan pertama: ");
        bilangan_1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        bilangan_2 = scanner.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        bilangan_3 = scanner.nextInt();

        int bilanganTerbesar;

        if (bilangan_1 > bilangan_2) {
            if (bilangan_1 > bilangan_3) {
                bilanganTerbesar = bilangan_1;
            } else {
                bilanganTerbesar = bilangan_3;
            }
        } else if (bilangan_2 > bilangan_3) {
            bilanganTerbesar = bilangan_2;
        } else {
            bilanganTerbesar = bilangan_3;
        }

        System.out.println("Bilangan terbesarnya adalah: " + bilanganTerbesar);
    }
}
