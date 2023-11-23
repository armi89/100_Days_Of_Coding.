
import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double panjang;
        double lebar;

        System.out.println("masukkan panjang persegi panjang:");
        panjang = scanner.nextByte();

        System.out.println("masukkan lebar persei panjang:");
        lebar = scanner.nextByte();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang * lebar);

        System.out.println("luas persegi panjang adalah:" + luas);
        System.out.println("keliling persegi panjang adalah :" + keliling);
    }

}
