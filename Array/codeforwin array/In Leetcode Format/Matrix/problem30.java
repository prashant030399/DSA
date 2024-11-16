
//WAP to find sum of each row and column of a matrix 

import java.util.*;

class Problem30 {

public List <Integer> sumofRow(int[][] matrix){
int n = matrix.length;
    List <Integer> rowSum = new ArrayList<>();

    for(int row=0 ; row<n ; row++ ){
    int sum =0;
for(int col=0; col<n ; col++ ){
    sum += matrix[row][col];
}
rowSum.add(sum);
    }
    return rowSum;
}



public List <Integer> sumofCol(int[][] matrix){
    int n= matrix.length;
List <Integer> colSum = new ArrayList<>();

for(int col=0 ; col<n ; col++){
    int sum=0;
    for(int row=0; row<n; row++){
        sum += matrix[row][col];
    }
    colSum.add(sum);
}
return colSum;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int matrix [] [] = new int [n][n];

    for(int row=0 ; row<n; row++){
        for(int col=0 ; col<n ; col++){
            matrix [row][col] = sc.nextInt();
        }
    }

Problem30 x = new Problem30();

List <Integer> rowSum = x.sumofRow(matrix);
List <Integer> colSum = x.sumofCol(matrix);

System.out.println("Sum of Rows : " + rowSum);
System.out.println("Sum of Cols : " + colSum);

}
}