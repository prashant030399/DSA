//WAP to find sum of minor diagonal elements of a matrix 

import java.util.Scanner;

class Problem29 {

public int sumofminordiagonal(int [][]a ){
int size = a.length; 
int sum =0;

for(int i=0 ;i<size ; i++ ){
    for(int j=0 ;j<size  ;j++){
        if(i+j == 2){
        sum += a[i][j];
        }
    }
}
return sum;
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
   
Problem29 x = new Problem29();
int result = x.sumofminordiagonal(a);

System.out.print(result);

}
}