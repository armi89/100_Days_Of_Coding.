
import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan usia anda:");
        int usia = scanner.nextInt();

        if (usia
                < 7) {
            System.out.println("anak - anak");
        } else if (usia
                <= 17) {
            System.out.println("remaja");
        } else if (usia
                <= 50) {
            System.out.println("dewasa");
        } else {
            System.out.println("Lansia");

        }

    }

}
