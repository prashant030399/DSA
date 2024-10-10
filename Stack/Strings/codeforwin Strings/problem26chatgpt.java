import java.util.*;

public class problem26chatgpt {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking string input
        String x = sc.nextLine();

        // Variables to store the new string
        String y = "";

        // Taking characters to be replaced and new character
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        // Manually finding the last occurrence of oldChar
        int lastIndex = -1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == oldChar) {
                lastIndex = i;
            }
        }

        // Looping through the string and replacing only the last occurrence
        for (int i = 0; i < x.length(); i++) {
            if (i == lastIndex) {
                y = y + newChar;  // Replace at the last occurrence
            } else {
                y = y + x.charAt(i);  // Keep the rest of the characters
            }
        }

        // Output the new string
        System.out.print(y);
    }
}
