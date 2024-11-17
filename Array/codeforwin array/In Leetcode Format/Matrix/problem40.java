//WAP to check symmetric matrix.

//Symmetric matrix is a square matrix which is equal to its transpose. 
//A symmetric matrix is always a square matrix. Symmetric matrix A is defined as – A = AT

import java.util.*;

class Problem40 {

public boolean checksymmetric(int [][] matrix){

    int n= matrix.length ;
int transposedmatrix [] [] = new int [n] [n];

for(int i=0 ;i<n ; i++){
    for(int j=0 ; j<n ; j++){
transposedmatrix [j][i] = matrix[i][j];        
    }
}

for(int i=0 ; i<n ; i++){
    for(int j=0 ;j<n ; j++){
        if(matrix[i][j] != transposedmatrix[i][j]){
            return false ;
            }
    }
}
return  true ;
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
    
        Problem40 x = new Problem40();
                boolean result =  x.checksymmetric(matrix);
               
                if(result){
                    System.out.print("\nIt is a symmetric matrix");
                } else{
                    System.out.print("\nIt is not a symmetric matrix");
                }

    }
}