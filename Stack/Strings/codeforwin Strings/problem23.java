//Write a Java program to remove all occurrences of a character from string.

import java.util.*;

public class problem23 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); 
        String y = ""; 
char c = sc.next().charAt(0);

for(int i=0 ; i<x.length() ; i++){
    if(x.charAt(i)!=c){
        y += x.charAt(i);
    }
} 
System.out.print(y);
    }

}