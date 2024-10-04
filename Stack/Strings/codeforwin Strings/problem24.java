//Write a Java program to remove all repeated characters from a given string.

import java.util.*;

public class problem24 {

public static void main(String args []){

Scanner sc = new Scanner (System.in);
String x = sc.nextLine();

String y = "";

for(int i=0 ; i<x.length() ; i++){
    if(y.indexOf(x.charAt(i))== -1){
        y = y + x.charAt(i);
    }
}
System.out.print(y);


}



}
