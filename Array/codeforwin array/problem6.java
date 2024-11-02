//WAP to count total number of even and odd elements in an array

import java.util.*;

public class problem6 {
public static void  main(String args []){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int x[] = new int [n];

for(int i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
}

int counteven  =0;
int countodd  =0;

for(int i=0 ; i<n ; i++){
    if(x[i]%2 ==0){
        counteven ++;
    }
    else if(x[i]%2 !=0){
        countodd ++;
    }
}

System.out.println("Total number of even elements : " + counteven);
System.out.print("Total number of odd elements : " + countodd);




}}