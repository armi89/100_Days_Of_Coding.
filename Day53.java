
import java.util.Scanner;

public class Day53 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String teks;

        System.out.print("Masukkan teks: ");
        teks = scanner.nextLine();

        String teks_Huruf_Kecil = teks.toLowerCase();

        System.out.println("Teks dengan huruf kecil: " + teks_Huruf_Kecil);
    }
}
