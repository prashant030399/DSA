import java.util.Scanner;

public class problem22chatgpt {
    public static String removeLastOccurrence(String str, char ch) {
        // Find the last occurrence of the character
        int index = str.lastIndexOf(ch);
        
        // If the character is not found, return the original string
        if (index == -1) {
            return str;
        }
        
        // Remove the character at the found index
        return str.substring(0, index) + str.substring(index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input character
        System.out.println("Enter the character to remove: ");
        char characterToRemove = scanner.next().charAt(0);

        // Remove last occurrence of the character
        String result = removeLastOccurrence(inputString, characterToRemove);

        // Output the result
        System.out.println("String after removing last occurrence of '" + characterToRemove + "': " + result);
    }
}
