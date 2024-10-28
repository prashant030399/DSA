import java.util.Scanner;

public class problem36chatgpt  {

    public static String trimTrailing(String x) {
        int index = x.length() - 1;

        for (int i = x.length() - 1; i >= 0; i--) {
            if (x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n') {
                index = i;
                break;
            }
        }
        return x.substring(0, index + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with trailing whitespace: ");
        String x = sc.nextLine();
        String trimmed = trimTrailing(x);
        System.out.println("Trimmed string: " + trimmed);
    }
}
