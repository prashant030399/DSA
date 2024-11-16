import java.util.*;

class Problem30chatgpt {
    public List<Integer> sumOfRows(int[][] matrix) {
        int n = matrix.length;
        List<Integer> rowSums = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int col = 0; col < n; col++) {
                sum += matrix[row][col];
            }                                                                                  
            rowSums.add(sum);
        }
        return rowSums;
    }

    public List<Integer> sumOfColumns(int[][] matrix) {
        int n = matrix.length;
        List<Integer> colSums = new ArrayList<>();
        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum += matrix[row][col];
            }
            colSums.add(sum);
        }
        return colSums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Input elements in the matrix from user
        System.out.println("Enter elements in the matrix of size " + n + "x" + n + ":");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        Problem30chatgpt solution = new Problem30chatgpt();
        List<Integer> rowSums = solution.sumOfRows(matrix);
        List<Integer> colSums = solution.sumOfColumns(matrix);

        System.out.println("Row sums: " + rowSums);
        System.out.println("Column sums: " + colSums);

        scanner.close();
    }
}


