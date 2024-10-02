//Write a Java program to search all occurrences of a character in given string.

import java.util.*;

public class problem16 {

public static void main(String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
char k = sc.next().charAt(0);

for(int i=0 ; i<x.length(); i++){
    char c = x.charAt(i);
    if(c==k){
        System.out.print(i + " ");
    }
}

}
}