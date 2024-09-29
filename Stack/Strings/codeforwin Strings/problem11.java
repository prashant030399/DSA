//Write a java program to find reverse of a string.

import java.util.*;

public class problem11 {

    public static void main(String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
String reverse = "";

for(int i=x.length()-1 ; i>=0 ; i--){
  reverse += x.charAt(i);
}

System.out.print(reverse);


    }

    
}