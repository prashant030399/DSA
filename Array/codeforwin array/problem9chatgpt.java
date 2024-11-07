import java.util.Scanner;

public class problem9chatgpt {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        int[] arr = new int[MAX_SIZE];
        int size, num, pos;

        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter size of the array: ");
        size = scanner.nextInt();

        // Input elements in array
        System.out.print("Enter elements in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input new element and position to insert
        System.out.print("Enter element to insert: ");
        num = scanner.nextInt();
        System.out.print("Enter the element position: ");
        pos = scanner.nextInt();

        // Check if position is valid
        if (pos > size + 1 || pos <= 0) {
            System.out.printf("Invalid position! Please enter position between 1 to %d%n", size + 1);
        } else {
            // Shift elements to the right to make space for the new element
            for (int i = size; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert new element at given position and increment size
  arr[pos -1 ] = num;
  size ++;

  // Print array after insertion
  System.out.println("Array elements after insertion: ");
  for(int i=0 ; i<size ; i++){
    System.out.print(arr[i] + "\t");
  }
 
        }}}