//WAP to find transpose of a matrix.

import java.util.*;

class Problem36 {

public int  [][]transpose(int [][] matrix){

int n= matrix.length;
int transposedmatrix [][] = new int [n][n];

for(int i=0 ; i<n ; i++){
    for(int j=0 ; j<n ; j++){
transposedmatrix[j][i] = matrix[i][j];
    }
}
return transposedmatrix;
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
    
        Problem36 x = new Problem36();
                int result[][] =  x.transpose(matrix);
               
for(int i=0 ; i<n ; i++){
    for(int j=0 ; j<n ; j++){
        System.out.print(result[i][j]);
    }
    System.out.println();
}

    }
}
