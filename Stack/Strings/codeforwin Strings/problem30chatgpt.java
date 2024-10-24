import java.util.Scanner;

public class problem30chatgpt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and word from user
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

        System.out.println("Enter any word to search: ");
        String word = sc.nextLine();

        int strLen = str.length();  // Find length of string
        int wordLen = word.length(); // Find length of word

        int lastOccurrence = -1;  // To store the last occurrence index

        /*
         * Run a loop from starting index of string to
         * length of string - word length
         */
        for (int i = 0; i <= strLen - wordLen; i++) {
            // Match word at current position
            boolean found = true;

            for (int j = 0; j < wordLen; j++) {
                // If word is not matched
                if (str.charAt(i + j) != word.charAt(j)) {
                    found = false;
              break;
                }
            }

            // If word has been found, update lastOccurrence
            if (found) {
                lastOccurrence = i;
            }
        }

        // If the word was found, print the last occurrence index
        if (lastOccurrence != -1) {
            System.out.println("'" + word + "' found at index: " + lastOccurrence);
        } else {
            System.out.println("'" + word + "' not found in the string.");
        }
    }
}
