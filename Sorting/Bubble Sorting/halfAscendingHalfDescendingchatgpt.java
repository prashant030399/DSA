public class halfAscendingHalfDescendingchatgpt {

    public static void main(String[] args) {
        int a[] = {5, 3, 8, 2, 1, 6, 3, 9};

        // Sort first half in ascending order
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length / 2 - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap without using temporary variable
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }

        // Sort second half in descending order
        for (int i = a.length / 2; i < a.length - 1; i++) {
            for (int j = a.length / 2; j < a.length - 1 - (i - a.length / 2); j++) {
                if (a[j] < a[j + 1]) {
                    // Swap without using temporary variable
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }

        // Print the array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

