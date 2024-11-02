//WAP to count total number of negative elements in an array

import java.util.*;

public class problem7 {
public static void  main(String args []){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int x[] = new int [n];

for(int i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
}

int countnegative  =0;

for(int i=0 ; i<n ; i++){
    if(x[i] < 0){
        countnegative ++;
    }
}
System.out.print("Total number of negative elements : "+ countnegative);

}}