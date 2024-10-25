import java.util.Scanner;

public class problem35chatgptforloop {

    /* Function to trim leading whitespaces */
    public static String trimLeading(String str) {
        int index = 0;

        // Use for loop to find the first non-whitespace character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
                index = i;
                break;
            }
        }

        // Return the substring starting from the first non-whitespace character
        return str.substring(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter any string: ");
        String str = scanner.nextLine();

        System.out.println("\nString before trimming leading whitespace:");
        System.out.println(str);

        // Trim leading whitespaces
        String trimmedStr = trimLeading(str);

        System.out.println("\nString after trimming leading whitespace:");
        System.out.println(trimmedStr);

        scanner.close();
    }
}

