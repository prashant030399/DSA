import java.util.Scanner;

public class problem3chatgpt {

    /* Function to find the sum of array elements recursively */
    public static int sum(int[] arr, int start, int len) {
        // Base condition for recursion
        if (start >= len) {
            return 0;
        }
        
        // Recursively calculate the sum
        return arr[start] + sum(arr, start + 1, len);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size and elements in the array
        System.out.print("Enter size of the array: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter elements in the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the sum of array elements
        int sumOfArray = sum(arr, 0, N);
        System.out.println("Sum of array elements: " + sumOfArray);
    }
}

