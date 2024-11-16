import java.util.*;

class Sumchatgpt {

    // Method to calculate the sum of all elements in a list
    public List<Integer> sumofRows(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        // Loop through the list and calculate the sum
        for (int value : list) {
            sum += value;
        }
        // Add the sum to the result list
        result.add(sum);
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Initialize a list and add values
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(1, 88); // Add 88 at index 1

        // Print the list after modification
        System.out.println("List: " + l);

        // Calculate the sum of elements in the list
        Sumchatgpt x = new Sumchatgpt();
        List<Integer> sumResult = x.sumofRows(l);
        // Print the sum
        System.out.println("Sum of rows: " + sumResult.get(0));  // Accessing the first element of the result list
    }
}
