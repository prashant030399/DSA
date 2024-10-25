//Write a Java program to remove first occurrence of a word in a given string

import java.util.*;

public class problem32 {
    
public static void main(String args []){

Scanner sc = new Scanner(System.in);

String x = sc.nextLine();
String y [] = x.split(" ");

String x1 ="";
int d=0;

String word = sc.next();

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word) && d==0) {
      d++;
    }
    else{
        x1 = x1 + y[i] + " ";
    }
}
System.out.print(x1);
}
}


