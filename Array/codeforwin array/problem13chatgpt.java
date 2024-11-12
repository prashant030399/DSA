import java.util.Scanner;

public class problem13chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] x = new int[size];

        // Find the maximum value in the input array to size the count array appropriately
        int max = 0;
        for (int i = 0; i < size; i++) {
            x[i] = sc.nextInt();
            if (x[i] > max) {
                max = x[i];
            }
        }

        // Create a count array of size (max + 1) to track occurrences
        int[] count = new int[max + 1];

        // Count the occurrences of each number
        for (int i = 0; i < size; i++) {
            count[x[i]]++;
        }

        // Count the total number of repeated occurrences
        int repeatedCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                repeatedCount += (count[i] - 1); // Add the number of repetitions beyond the first occurrence
            }
        }
        System.out.print(repeatedCount);
    }
}

