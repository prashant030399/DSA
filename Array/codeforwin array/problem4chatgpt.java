import java.util.Scanner;

public class problem4chatgpt{

    // Recursive function to find the maximum element in the array
    public static int findMax(int[] arr, int start, int len) {
        if (start == len - 1) {
            return arr[start];
        }
        
        // Find the maximum of the remaining array
        int maxInRest = findMax(arr, start + 1, len);
        
        // Return the maximum of the current element and max in the remaining array
        return Math.max(arr[start], maxInRest);
    }

    // Recursive function to find the minimum element in the array
    public static int findMin(int[] arr, int start, int len) {
        if (start == len - 1) {
            return arr[start];
        }
        
        // Find the minimum of the remaining array
        int minInRest = findMin(arr, start + 1, len);
        
        // Return the minimum of the current element and min in the remaining array
        return Math.min(arr[start], minInRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding maximum and minimum using recursion
        int max = findMax(arr, 0, size);
        int min = findMin(arr, 0, size);
        
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}

