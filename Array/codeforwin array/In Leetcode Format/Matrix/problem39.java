//WAP to check sparse matrix.

//Sparse matrix is a special matrix with most of its elements are zero. 
//We can also assume that if (m * n) / 2 elements are zero then it is a sparse matrix.

import java.util.*;

class Problem39 {

public boolean checksparse(int [][] matrix){

    int n= matrix.length ;
int total = 0;

    for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<n ; j++){
if(matrix[i][j] == 0){
    total ++;
}           
        }
    }
if(total >= (n*n)/2){
    return true;
}
return false ;

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
    
        Problem39 x = new Problem39();
                boolean result =  x.checksparse(matrix);
               
                if(result){
                    System.out.print("\nIt is a sparse matrix");
                } else{
                    System.out.print("\nIt is not a sparse matrix");
                }


    }
}
