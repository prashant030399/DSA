import java.util.*;

public class problem22chatgpt1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); // Input the string
        String y = ""; // To store the result
        int lastOccurrenceIndex = -1;

        // Input the character to be removed
        char c = sc.next().charAt(0);

        // Find the last occurrence index of the character
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == c) {
                lastOccurrenceIndex = i;
            }
        }

        // Construct the new string, skipping the last occurrence of the character
        for (int i = 0; i < x.length(); i++) {
            if (i == lastOccurrenceIndex) {
                continue; // Skip the last occurrence
            }
            y = y + x.charAt(i);
        }

        // Output the result
        System.out.print(y);
    
    }
}
