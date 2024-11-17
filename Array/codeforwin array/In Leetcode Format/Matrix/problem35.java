//WAP to find sum of lower triangular matrix

import java.util.*;

class Problem35 {

public int  sumoflowertriangular(int [][] matrix){

int n= matrix.length;
int sum =0;
for(int i=0 ; i<n ; i++){
    for(int j=0 ; j<n ; j++){
    if(i>j){
        sum += matrix[i][j];
    }
    }
}
return sum;
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
    
        Problem35 x = new Problem35();
                int result =  x.sumoflowertriangular(matrix);
                System.out.print("Sum of lower triangular matrix : " + result);

    }
}
