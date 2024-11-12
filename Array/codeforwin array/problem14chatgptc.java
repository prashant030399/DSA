import java.util.Scanner;

public class problem14chatgptc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] x = new int[size];
        int c = 0; // Counter to track how many elements have been removed

        // Reading input array
        for (int i = 0; i < size; i++) {
            x[i] = sc.nextInt();
        }

        // Removing duplicates
        for (int i = 0; i < x.length - c; i++) {
            for (int j = i + 1; j < x.length - c; j++) {
                if (x[i] == x[j]) {
                    // Shift elements to the left
                    for (int k = j; k < x.length - 1 - c; k++) {
                        x[k] = x[k + 1];
                    }
                    c++; // Increment the count of removed elements
                    j--; // Decrement j to recheck the current position
                }
            }
        }

        // Printing the array without duplicates
        for (int i = 0; i < x.length - c; i++) {
            System.out.println(x[i]);
        }
    }
}
