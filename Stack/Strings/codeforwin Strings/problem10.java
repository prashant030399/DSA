//Write a java program to count total number of words in a string.

import java.util.*;

public class problem10 {

    public static void main(String args []){
Scanner sc = new Scanner (System.in);
String x = sc.nextLine();
int countwords = 1;

for(int i=0 ; i<x.length() ; i++){
   if(x.charAt(i) == ' ' || x.charAt(i) == '\n' || x.charAt(i) == '\t' ){
    countwords ++;
   } 
}

System.out.print(countwords);





    }

    
}
