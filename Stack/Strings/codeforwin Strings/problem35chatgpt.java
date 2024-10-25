import java.util.Scanner;

public class problem35chatgpt {

    /* Function to trim leading whitespaces */
    public static String trimLeading(String str) {
        int index = 0;

        // Find the first non-whitespace character
        while (index < str.length() && 
               (str.charAt(index) == ' ' || str.charAt(index) == '\t' || str.charAt(index) == '\n')) {
            index++;
        }

        // Return the substring starting from the first non-whitespace character
        return str.substring(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter any string: ");
        String str = scanner.nextLine();

        // Trim leading whitespaces
        String trimmedStr = trimLeading(str);
      
        System.out.println(trimmedStr);

    }
}

