
import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int batas_Lulus = 60;

        System.out.print("Masukkan nilai anda: ");
        int nilai = scanner.nextInt();

        if (nilai >= batas_Lulus) {
            System.out.println(" anda Lulus");
        } else {
            System.out.println(" anda Tidak lulus");
        }
    }
}
