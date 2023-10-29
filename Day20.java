
public class Day20 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 9, 10};
        int minValue = numbers[0];

        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }

        System.out.println("Nilai terkecil: " + minValue);
    }
}

    
  

