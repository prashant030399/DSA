//WAP to copy all elements from an array to another array

import java.util.*;

public class problem8 {
public static void  main(String args []){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int source [] = new int [n];
int destination[] = new int[n];

for(int i=0 ; i<n ; i++){
    source[i] = sc.nextInt();
}

for(int i=0 ; i<n ; i++){
    destination[i] = source[i];
}

for(int i=0 ; i<n ; i++){
    System.out.println(destination[i]);
}


}}


