
import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        int mtk;
        int fisika;
        int kimia;

        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nilai ujian mtk anda:");
        mtk = scanner.nextInt();

        System.out.println("masukkan nilai ujian fisika anda:");
        fisika = scanner.nextInt();

        System.out.println("masukkan nilai ujian mtk anda:");
        kimia = scanner.nextInt();
        double rataRata = (mtk + fisika + kimia) / 3;

        System.out.println("nilai rata- rata:" + rataRata);

    }

}
