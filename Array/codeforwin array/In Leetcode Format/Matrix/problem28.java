//WAP to find sum of main diagonal elements of a matrix 

import java.util.Scanner;

class Problem28 {

public int sumofmaindiagonal(int [][]a ){
int size = a.length; 
int sum =0;

for(int i=0 ;i<size ; i++ ){
    for(int j=0 ;j<size  ;j++){
        if(i == j){
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
   
Problem28 x = new Problem28();
int result = x.sumofmaindiagonal(a);

System.out.print(result);

}
}
