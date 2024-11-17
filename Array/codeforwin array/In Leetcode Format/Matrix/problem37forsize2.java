//WAP to find determinant of a matrix.

import java.util.*;

class Problem37forsize2 {

public int  determinant(int [][] matrix){

    int n= matrix.length ;
int det =0;

int a = matrix[0][0];
int b = matrix[0][1];
int c = matrix[1][0];
int d = matrix[1][1];

det = a*d - b*c;
return det ;


}
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int n = 2;
    
        int matrix [] [] = new int [n][n];
    
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                matrix [i][j] = sc.nextInt();
            }
        }
    
        Problem37forsize2 x = new Problem37forsize2();
                int result =  x.determinant(matrix);
               
System.out.print(result);

    }
}
