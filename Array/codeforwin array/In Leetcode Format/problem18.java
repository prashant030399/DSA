//WAP to search an element in an array

import java.util.*;

class Problem18 {
    

    public int searchElement(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (element == a[i]) {
                return i; 
            }
        }
        return -1; 
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
        
        Problem18 x = new Problem18();
        int result = x.searchElement(a, element);
        
        if (result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close(); 
    }
}
