import java.util.Scanner;

public class problem8chatgpt {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        int[] source = new int[MAX_SIZE];
        int[] dest = new int[MAX_SIZE];
        int size;

        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();

        // Input array elements
        System.out.println("Enter elements of source array: ");
        for (int i = 0; i < size; i++) {
            source[i] = scanner.nextInt();
        }

        // Copy all elements from source array to dest array
        for (int i = 0; i < size; i++) {
            dest[i] = source[i];
        }

        // Print all elements of source array
        System.out.println("\nElements of source array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(source[i] + "\t");
        }

        // Print all elements of dest array
        System.out.println("\nElements of dest array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(dest[i] + "\t");
        }

        scanner.close();
    }
}
