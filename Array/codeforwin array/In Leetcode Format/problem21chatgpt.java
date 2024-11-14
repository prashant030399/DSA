import java.util.*;

public class problem21chatgpt {

    // Method to rotate the array N times and return the final rotated array
    public int[] rotateLeft(int[] arr, int N) {
        int SIZE = arr.length;
        N = N % SIZE; // Normalize the number of rotations

        for (int i = 0; i < N; i++) {
            int first = arr[0];
            for (int j = 0; j < SIZE - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[SIZE - 1] = first;
        }
        return arr;
    }

    // Test method (You can remove or modify this for actual LeetCode submission)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        problem21chatgpt solution = new problem21chatgpt();
        int size  = sc.nextInt();
int arr[] = new int [size];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int N = sc.nextInt();
        
        // Get the rotated array
        int[] result = solution.rotateLeft(arr, N);
        
        // Print array after rotation
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}


