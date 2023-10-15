
import java.util.Scanner;


public class Day6 {
    public static void main(String[] args) {
          // Buat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Input umur
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Tampilkan hasil input
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
    
}
