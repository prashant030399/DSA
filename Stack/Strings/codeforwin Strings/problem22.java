//Write a Java program to remove last occurrence of a character from string.

import java.util.*;

public class problem22 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); 
        String y = ""; 
        int lastOccurrenceIndex = -1;

        char c = sc.next().charAt(0);

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
