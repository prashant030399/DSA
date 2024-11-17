//WAP to interchange  diagonals of a matrix
import java.util.*;

class Problem31 {
    
public int [] [] interchange(int [][]matrix){
int n= matrix.length;

for(int i=0 ;i<n ; i++){

    int j=i;

int p= matrix[i][j];
matrix[i][j] = matrix[i][(n-j)-1];
matrix[i][(n-j)-1] = p;
}
return matrix;
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int matrix [] [] = new int [n][n];

    for(int i=0 ; i<n; i++){
        for(int j=0; j<n; j++){
            matrix [i][j] = sc.nextInt();
        }
    }

    Problem31 x = new Problem31();
    int result [] [] = x.interchange(matrix);

    for(int i=0 ; i<n ; i++){
        for(int j=0; j<n ; j++){
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }

}

}
