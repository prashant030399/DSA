import java.util.*;

class Problem18chatgpt {
    
    // Method to search for an element and return its index
    public int searchElement(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (element == a[i]) {
                return i; // Return the index when the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int[] a = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to search for:");
        int element = sc.nextInt();
        
        Problem18chatgpt x = new Problem18chatgpt();
        int result = x.searchElement(a, element);
        
        if (result != -1) {
            System.out.println("Element found at position : " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
