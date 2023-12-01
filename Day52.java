
import java.time.LocalTime;
import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {
        String waktu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan waktu:");
        waktu = scanner.nextLine();

        LocalTime waktuLocalTime = LocalTime.parse(waktu);

        System.out.println("waktu yang anda input adalah " + waktuLocalTime);
    }

}
