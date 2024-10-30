import java.util.Scanner;

public class problem1chatgpt {

    /* Function to print array recursively */   
    public static void printArray(int[] arr, int start, int len) {
        // Base condition for recursion
        if (start >= len) {
            return;
        }
        
        // Print current element
        System.out.print(arr[start] + ", ");
        
        // Recursive call to print the next element
        printArray(arr, start + 1, len);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of the array
        System.out.print("Enter size of the array: ");
        int N = scanner.nextInt();
        
        int[] arr = new int[N];
        
        // Input elements in the array
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Print array elements using recursion
        System.out.print("Elements in the array: ");
        printArray(arr, 0, N);
        
        scanner.close();
    }
}


