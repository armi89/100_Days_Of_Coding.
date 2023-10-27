
public class Day19 {
    public static void main(String[] args) {
         int[] numbers = {10, 20, 30, 40, 50};
        int maxValue = numbers[0];

        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        System.out.println("Nilai terbesar: " + maxValue);
    }
}


    
    

