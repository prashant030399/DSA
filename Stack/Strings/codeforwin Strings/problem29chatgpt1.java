import java.util.*;

public class problem29chatgpt1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String x = sc.nextLine();  // Input string

        System.out.println("Enter the word to find:");
        String word = sc.next();  // Word to search for
        int lastOccurrenceIndex = -1;

        int wordLength = word.length();
        int tempIndex = 0; // This will hold the index of the current word in the string

        // Loop to find the last occurrence of the word and its starting index
        while ((tempIndex = x.indexOf(word, tempIndex)) != -1) {
            lastOccurrenceIndex = tempIndex;
            tempIndex += wordLength;  // Move past the current occurrence to find the next
        }

        // If found, print the index of the first letter of the last occurrence
        if (lastOccurrenceIndex != -1) {
            System.out.println("The index of the first character of the last occurrence of the word is: " + lastOccurrenceIndex);
        } else {
            System.out.println("Word not found");
        }
    }
}
