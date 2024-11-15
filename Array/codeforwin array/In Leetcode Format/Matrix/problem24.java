//WAP to subtract two matrices

import java.util.*;

class Problem24 {

public int [] [] subtracttwomatrices(int [][]a , int [][]b){
int size = a.length;
int [] [] c = new int [size] [size];

for(int i=0 ; i<size ; i++){
    for(int j=0; j<size ; j++){
        c[i] [j] = a[i][j] - b[i] [j];
    }
}
return c;

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

        Problem24 x = new Problem24();
 int result [] [] = x.subtracttwomatrices(a,b);
 
 System.out.print("Subtraction of matrice a & b : ");
 System.out.println();
 for(int i=0 ; i<size ; i++){
    for(int j=0 ; j<size ; j++){
        System.out.print(result[i][j] + " ");
    }
    System.out.println();
 }


}



}