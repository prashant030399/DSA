//Write a Java program to count frequency of each character in a string.

import java.util.*;

public class problem20 {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

 int freq [] = new int [26];
    x = x.toUpperCase();

    for(int i=0 ; i<x.length() ; i++){
        if(x.charAt(i)>=65 && x.charAt(i)<=90){
            freq [x.charAt(i) - 65] ++;
        }
    }

    for(int i=0 ; i<26 ; i++){
System.out.print((char)(i + 65) + "-");
System.out.println(freq[i]);
    }
    
    }

}