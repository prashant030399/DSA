//Write a Java  program to count occurrences of a character in given string.

import java.util.*;

public class problem17 {

public static void main(String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
char k = sc.next().charAt(0);
int countchar =0;


for(int i=0 ; i<x.length() ; i++){
    char c = x.charAt(i);

    if(c==k){
countchar ++;    
}

}
System.out.print("Number of times "+ k +" has occurred is " + countchar);
    }
}
