//WAP to remove all extra blank spaces from given string

import java.util.Scanner;

public class problem38 {

    public static String removeBlanks(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == ' ') {
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
        String str = scanner.nextLine();
        String newString = removeBlanks(str);
        System.out.println(newString );

    

    }
}

