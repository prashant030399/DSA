//Write a Java  program to find last occurrence of a character in a given string.

import java.util.*;

public class problem15 {

public static void main(String args []){
Scanner sc = new Scanner (System.in);
String x = sc.nextLine();

int z=0 ;
char k = sc.next().charAt(0);

for(int i=0 ; i<x.length() ;i++){
char c = x.charAt(i);

if(c==k){
    z=i;
}
}

System.out.print(z);

}
}