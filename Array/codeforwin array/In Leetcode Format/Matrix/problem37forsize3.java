//WAP to find determinant of a matrix.

import java.util.*;

class Problem37forsize3 {

public int  determinant(int [][] matrix){

    int n= matrix.length ;
int det =0;

int a = matrix[0][0];
int b = matrix[0][1];
int c = matrix[0][2];
int d = matrix[1][0];
int e = matrix[1][1];
int f = matrix[1][2];
int g = matrix[2][0];
int h = matrix[2][1];
int i = matrix[2][2];


det = a*(e*i - h*f) -b*(d*i - g*f) +c*(d*h - e*g);
return det ;


}
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int n = 3;
    
        int matrix [] [] = new int [n][n];
    
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                matrix [i][j] = sc.nextInt();
            }
        }
    
        Problem37forsize3 x = new Problem37forsize3();
                int result =  x.determinant(matrix);
               
System.out.print(result);

    }
}
