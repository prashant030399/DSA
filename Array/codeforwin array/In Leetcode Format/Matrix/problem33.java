//WAP to find lower triangular matrix

//Lower triangular matrix is a special square matrix whose all elements above the main diagonal is zero.

import java.util.*;

class Problem33 {

public boolean checklowertriangular(int [][] matrix){

int n= matrix.length;

for(int i=0 ; i<n ; i++){
    for(int j=0 ; j<n ; j++){
        if(i<j){
            if(matrix[i][j] != 0){
                return  false;
            }
        }
    }
}
return true ;
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
    
        Problem33 x = new Problem33();
                boolean result =  x.checklowertriangular(matrix);

                if(result){
                    System.out.print("\nIt is a lower triangular matrix");
                } else {
                    System.out.print("\nIt is not a lower triangular matrix");
                }

    }
}
