import java.util.Scanner;

public class problem23chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string: ");
        String x = sc.nextLine();

        // Input the character to be removed
        System.out.println("Enter the character to remove: ");
        char c = sc.next().charAt(0);

        // Initialize an empty result string
        String y = "";

        // Iterate over the string and add characters to the result if they are not equal to the specified character
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != c) {
                y = y + x.charAt(i);
            }
        }

        // Output the result
        System.out.println("String after removing all occurrences of '" + c + "': " + y);
    }
}

