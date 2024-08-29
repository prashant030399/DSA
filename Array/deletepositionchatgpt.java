import java.util.Scanner;

public class deletepositionchatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array as input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initializing the array
        int[] array = new int[size];

        // Taking the array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Taking the position of the element to be deleted as input
        System.out.print("Enter the position to delete (1 to " + size + "): ");
        int position = scanner.nextInt();

        // Checking if the position is valid
        if (position < 1 || position > size) {
            System.out.println("Invalid position!");
        } else {
            // Deleting the element by shifting the elements
            for (int i = position - 1; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            // Reducing the size of the array
            size--;

            // Displaying the array after deletion
            System.out.println("Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
}

