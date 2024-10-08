//Write a Java program to find first occurrence of a word in a given string.

import java.util.*;

public class problem28 {

public static void main (String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
String y [] = x.split(" ");

String word  = sc.next();

int c =0;   //  this is for... if the word that i enter would match in String x 

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word)){
        System.out.print(x.indexOf(y[i]));
        c++;
    }
}

if(c==0){
    System.out.print("Word is not available");
}

}
}