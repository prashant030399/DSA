public class  problem12chatgpt {
    public static void main(String[] args) {
        // Sample array
        int[] array = {4, 5, 6, 4, 5, 4, 7, 6, 8};
        int[] visited = new int[array.length]; // Array to mark visited elements
        int visitedFlag = -1; // Special flag to indicate an element has been counted

        // Traverse the array and count the frequency of each element
        for (int i = 0; i < array.length; i++) {
            if (visited[i] == visitedFlag) {
                continue; // Skip if already counted
            }

            int count = 1; // Initial frequency count
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = visitedFlag; // Mark this element as counted
                }
            }

            // Mark the current element as counted
            visited[i] = visitedFlag;

            // Display the element only if its frequency is 1 (unique)
            if (count == 1) {
                System.out.println("Unique Element: " + array[i]);
            }
        }
    }
}



