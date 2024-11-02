//Write a java program to find sum of all array elements. – using recursion.
import java.util.*;

public class problem3void {

    // Recursive function to calculate sum of array elements
    public static void sumofarray(int x[], int start, int len, int[] sum) {
        if (start >= len) {
            return;
        }
        
        // Add the current element to sum
        sum[0] += x[start];
        
        // Recursive call with next element
        sumofarray(x, start + 1, len, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int x[] = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        // Array to hold the sum, allowing it to be updated within the recursion
        int[] sum = {0};
        
        // Calling the recursive function
        sumofarray(x, 0, n, sum);
        
        System.out.println("Sum of array elements: " + sum[0]);
    }
}

