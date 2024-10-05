//Write a Java program to replace first occurrence of a character with another in a string.

import java.util.*;

public class problem25 {

public static void main (String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();

String y = "";

char oldChar = sc.next().charAt(0);
char newChar = sc.next().charAt(0);


for(int i=0 ;i<x.length() ; i++){
    if(x.charAt(i)  == oldChar){
        y += newChar;

        for(int j =i+1 ; j<x.length() ; j++){
            y += x.charAt(j);
        } break;
    }
        else {
             y += x.charAt(i);
        }
    
}

        // If no replacement occurred (handle cases when oldChar is not found)
        if (y.isEmpty()) {
            y = x;
        }

System.out.print(y);

}

}