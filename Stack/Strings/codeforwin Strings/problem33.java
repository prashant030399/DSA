//Write a Java program to remove last occurrence of a word in a given string

import java.util.*;

public class problem33 {
    
public static void main(String args []){

Scanner sc = new Scanner(System.in);

String x = sc.nextLine();
String y [] = x.split(" ");
String x1 ="";
int lastoccurrenceindex =0;
String word = sc.next();

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word)) {
      lastoccurrenceindex = i;
    }
}

for(int i=0 ; i<y.length ; i++){
    if(i == lastoccurrenceindex){
        continue;
    }
    x1 = x1 + y[i] + " "; 
}

System.out.print(x1);

}
}