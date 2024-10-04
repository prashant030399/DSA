//Write a Java program to remove first occurrence of a character from string.

import java.util.*;

public class problem21 {

public static void main(String args []){

Scanner sc = new Scanner (System.in);
String x = sc.nextLine();
String y = "";
int d=0;

char c = sc.next().charAt(0);

for(int i=0 ; i<x.length() ; i++){
if(x.charAt(i)==c && d==0){
    d++;
 
}
else{
    y = y + x.charAt(i);
}
}

System.out.print(y);

}
}

