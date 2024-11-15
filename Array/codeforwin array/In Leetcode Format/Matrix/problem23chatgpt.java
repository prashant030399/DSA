import java.util.*;

class  Problem23chatgpt {

    public int[][] matrixSum(int[][] A, int[][] B) {
        int SIZE = A.length; // Assuming A and B are square matrices of the same size
        int[][] C = new int[SIZE][SIZE]; // Resultant matrix

        // Add both matrices A and B element-wise and store the result in matrix C
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                C[row][col] = A[row][col] + B[row][col];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 3; // Size of the matrix
        int[][] A = new int[SIZE][SIZE];
        int[][] B = new int[SIZE][SIZE];

        // Input elements in the first matrix
        System.out.println("Enter elements in matrix A of size 3x3:");
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                A[row][col] = sc.nextInt();
            }
        }

        // Input elements in the second matrix
        System.out.println("\nEnter elements in matrix B of size 3x3:");
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                B[row][col] = sc.nextInt();
            }
        }
     
        Problem23chatgpt solution = new  Problem23chatgpt();
        int[][] result = solution.matrixSum(A, B);

        // Print the resultant matrix C
        System.out.println("\nSum of matrices A + B =");
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}
