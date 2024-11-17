//WAP to find upper triangular matrix

//Upper triangular matrix is a special square matrix whose all elements below the main diagonal is zero.

import java.util.*;

class Problem32 {

public boolean checkuppertriangular(int [][] matrix){

int n= matrix.length;

for(int i=0 ; i<n; i++){
    for(int j=0 ; j<n ; j++){
if(i>j){
    if(matrix[i][j] != 0){
        return false ;
    }
}       
    }
}
return true;

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
    
        Problem32 x = new Problem32();
                boolean result =  x.checkuppertriangular(matrix);

                if(result){
                    System.out.print("\nIt is a upper triangular matrix");
                } else {
                    System.out.print("\nIt is not a upper triangular matrix");
                }

    }
}
