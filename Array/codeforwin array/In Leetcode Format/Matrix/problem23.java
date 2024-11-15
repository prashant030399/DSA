//WAP to add two matrices

import java.util.*;

class Problem23{       //i=row j=col

public int [][] addtwomatrices(int [][]a, int [][]b){
int size = a.length;
int [][] c = new int [size] [size];

    for(int i=0; i<size ; i++){
        for(int j=0 ; j<size ; j++){
c[i][j] = a[i][j] + b[i][j];
        }
    }
    return c;
}

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter size : ");
        int size = sc.nextInt();
 
        
                int[][] a  = new int [size ][size];
                System.out.println();
                System.out.print("Enter elements in matrice a ");
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                a[i][j] = sc.nextInt();
            }
        }

          int  [][]b = new int [size] [size];        
          System.out.println();
          System.out.print("Enter elements in matrice b ");
          for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        Problem23 x = new Problem23();
    int result[] [] = x.addtwomatrices(a,b);
     
    System.out.print("Sum of matrices a+b ");
    System.out.println();
for(int i=0 ; i<size ; i++ ){
    for(int j=0 ; j<size ; j++){
        System.out.print(result[i][j] + " ");
    }
    System.out.println();
}
    }
}