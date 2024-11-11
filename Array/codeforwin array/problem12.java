//WAP to print all unique element in the array.         

import java.util.*;

public class problem12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        int size = sc.nextInt();
        int x [] = new int[size];
        int count [] = new int[100];
        
for(int i=0 ; i<size ; i++){
    x[i] = sc.nextInt();
}


for(int i=0 ; i<x.length ; i++){
    count[x[i]] ++;
}

System.out.print("Unique elements are - ");

for(int i=0 ; i<count.length ; i++ ){
    if(count[i] == 1){
        System.out.print(i + " ");
    }
}

    }}

