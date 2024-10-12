//Write a Java program to find last occurrence of a word in a given string

import java.util.*;

public class problem29 {
    
public static void main (String  args []){

Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
String  y [] = x.split(" ");

String word = sc.next();
int lastoccurrenceindex = -1;

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word)){
    lastoccurrenceindex = x.indexOf(y[i], lastoccurrenceindex + 1);
    }
}

if(lastoccurrenceindex != -1){
    System.out.print(lastoccurrenceindex);
} else {
    System.out.print("Word not found");
}

}
}
