//WAP to check whether two matrices are equal or not

import java.util.Scanner;

class Problem27 {

public boolean checkequality(int [][]a , int[][]b ){
int size = a.length; 

for(int i=0 ;i<size ; i++ ){
    for(int j=0 ;j<size  ;j++){
        if(a[i][j] != b[i][j]){
            return  false;
        }
    }
}
return true;
}


public static void main(String[] args) {
    
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


Problem27 x = new Problem27();
boolean result = x.checkequality(a,b);

if(result){
    System.out.print("\nMatrix a is equal to Matrix b");
}
else {
    System.out.print("\nMatrix is not equal to Matrix b");
}
}
}
