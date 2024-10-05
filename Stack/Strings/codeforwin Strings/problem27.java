//Write a Java program to replace all occurrences of a character with another in a string.
import java.util.*;

public class problem27 {

    public static void main (String  args []) {

Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
String y ="";

char oldChar = sc.next().charAt(0);
char newChar = sc.next().charAt(0);

for(int i=0 ;i<x.length() ; i++){

 if(x.charAt(i) == oldChar){
y += newChar;
    }
    else{
        y += x.charAt(i);
    }
}
System.out.print(y);

} 
    
}
