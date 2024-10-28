//WAP to trim both leading and trailing white space characters from given string 

import java.util.Scanner;

public class problem37chatgpt {

    public static String trim(String x) {
        int start = 0;
        int end = x.length() - 1;

        // Find the first non-whitespace character from the start
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n') {
                start = i;
                break;
            }
        }

        // Find the last non-whitespace character from the end
        for (int i = x.length() - 1; i >= 0; i--) {
            if (x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n') {
                end = i;
                break;
            }
        }

        // Return the substring from the start to the end index
        return x.substring(start, end + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing whitespace: ");
        String x = sc.nextLine();
        String trimmed = trim(x);
        System.out.println("Trimmed string: " + trimmed);
    }
}
