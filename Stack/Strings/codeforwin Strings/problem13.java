//Write a Java Program to reverse order of a word

import java.util.*;

public class problem13 {
    public static void main(String args []){
Scanner sc = new Scanner (System.in);
String x = sc.nextLine();

//split would convert into an array
String y [] = x.split(" ");

for(int i=y.length -1 ; i>=0 ;i--){
  System.out.print(y[i] + " ");
}



    }

    
}
