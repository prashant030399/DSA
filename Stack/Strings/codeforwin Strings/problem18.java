//Write a Java program to find highest frequency character in a string.

import java.util.*;

public class problem18 {

public static void main(String args []){

Scanner sc = new Scanner (System.in);
String x = sc.nextLine();
x =x.toUpperCase();

// a is the frequency
int a [] = new int  [26];

for(int i=0 ; i<x.length(); i++){

// if condition for dealing with space
    if(x.charAt(i)>=65&&x.charAt(i)<=90)  
    { 
 a[x.charAt(i)-65]++;
}}

int max = -1;  //understood
int maxChar = 0;  // it is to be converted to char ... it's a char 

for(int i=0 ; i<26 ; i++){
    if(a[i]>max){
        max = a[i];
        maxChar = i;
    }
}

System.out.print(((char)(maxChar+65))+" - "+ max + "times");

    }
    
}
