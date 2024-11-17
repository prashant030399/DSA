//WAP to find sum of upper triangular matrix

import java.util.*;

class Problem34 {

public int  sumofuppertriangular(int [][] matrix){

int n= matrix.length;
int sum =0;
for(int i=0 ; i<n ; i++){
    for(int j=0 ; j<n ; j++){
    if(i<j){
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
    
        Problem34 x = new Problem34();
                int result =  x.sumofuppertriangular(matrix);
                System.out.print("Sum of upper triangular matrix : " + result);

    }
}

