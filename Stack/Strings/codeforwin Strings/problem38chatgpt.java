//WAP to remove all extra blank spaces from given string

import java.util.Scanner;

public class problem38chatgpt {

    /* Function to remove extra blank spaces from a string */
    public static String removeBlanks(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if current character is a space
            if (currentChar == ' ') {
                // Append one space only if it's the first in a sequence
                if (newString.length() == 0 || newString.charAt(newString.length() - 1) != ' ') {
                    newString.append(' ');
                }
            } else {
                newString.append(currentChar);
            }
        }
        return newString.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String str = scanner.nextLine();

        System.out.println("\nString before removing blanks: ");
        System.out.println("'" + str + "'");

        String newString = removeBlanks(str);

        System.out.println("\nString after removing blanks: ");
        System.out.println("'" + newString + "'");

        scanner.close();
    }
}
