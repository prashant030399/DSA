//WAP to check identity matrix.

//Identity matrix is a special square matrix whose main diagonal elements is equal to 1 
//and other elements are 0. 
//Identity matrix is also known as unit matrix.

import java.util.*;

class Problem38 {

public boolean checkidentity(int [][] matrix){

    int n= matrix.length ;

    for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<n ; j++){
            if(i==j){
                if(matrix[i][j] != 1){
                    return false;
                }
            }
            else if(i != j){
                if(matrix[i][j] != 0){
                    return false ;
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
    
        Problem38 x = new Problem38();
                boolean result =  x.checkidentity(matrix);
               
                if(result){
                    System.out.print("\nIt is an identity matrix");
                } else{
                    System.out.print("\nIt is not an identity matrix");
                }


    }
}
