//WAP to print all the negative elements in an array

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int x[] = new int [n];

for(int i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
}


for(int i=0 ; i<n ; i++){
 
if(x[i]<0){
    System.out.print(x[i] + " ");
}

}




    }

}
