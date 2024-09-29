//Write a java program to check whether a string is palindrome or not.

import java.util.*;

public class problem12 {
    
public static void main (String args []){

Scanner sc = new Scanner (System.in);
String x  = sc.nextLine();

String reverseString = "";

for(int i=x.length() -1 ; i>=0 ; i--){
    reverseString+=x.charAt(i);
}

if(x.equals(reverseString) ){
    System.out.print("Pallindrom Strings");
} else {
    System.out.print("Not a Pallindrom Strings ");  
}

}

}
