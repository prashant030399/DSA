import java.util.*;

public class problem19chatgpt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = sc.nextLine();
        x = x.toUpperCase(); // Convert input to uppercase for uniformity

        // Frequency array for 26 letters
        int a[] = new int[26];
        
        // Counting frequency of each letter
        for (int i = 0; i < x.length(); i++) {
            // Exclude spaces and non-alphabet characters
            if (x.charAt(i) >= 65 && x.charAt(i) <= 90) {
                a[x.charAt(i) - 65]++;
            }
        }

        int min = Integer.MAX_VALUE; // For tracking minimum frequency
        int minChar = -1; // To track the character with minimum frequency

        // Find the character with the lowest frequency greater than 0
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0 && a[i] < min) {
                min = a[i];
                minChar = i;
            }
        }

        // Output result
        if (minChar != -1) {
            System.out.print(((char) (minChar + 65)) + " - " + min + " time(s)");
        } else {
            System.out.print("No characters found.");
        }



    }
}

