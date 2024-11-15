//WAP to perform Scaler matrix multiplication
import java.util.*;

 class Problem25 {
    
public int [][] scalarmatrix(int [][]a){
int size = a.length;

int [] [] c = new int [size] [size] ;

    for(int i=0 ; i<size ; i++){
    for(int j=0 ; j<size ; j++){
c[i][j] = a[i][j] *2  ;
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
   
Problem25 x = new Problem25();
int[][] result = x.scalarmatrix(a);

for(int i=0 ; i<size ; i++){
    for(int j=0 ; j<size ; j++){
        System.out.print(result[i][j] + " " );
    }
System.out.println();
}

}
}
