
import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("masukkan data ke-" + (i + 1) + ": ");
            String data = scanner.nextLine();

            System.out.println("Data ke-" + (i + 1) + ": " + data);
        }
    }

}
