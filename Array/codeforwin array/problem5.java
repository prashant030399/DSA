//Write a java program to find second largest element in an array

import java.util.*;

public class problem5 {
public static void  main(String args []){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int x[] = new int [n];

for(int i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
}

int max = Integer.MIN_VALUE;
int secondmax =Integer.MIN_VALUE;


for(int i=0; i<n ; i++){
    
    if(x[i]> max ){
    secondmax = max ;
        max = x[i];
    }
else if(x[i] > secondmax  && x[i] < max ){
            secondmax = x[i];
        }
    }

System.out.print(secondmax  + " ");
    }    
}
