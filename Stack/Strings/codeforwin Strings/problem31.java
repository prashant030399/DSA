//Write a Java program to count occurrences of a word in given string

import java.util.*;

public class problem31 {
    
public static void main(String args []){

Scanner sc = new Scanner(System.in);

String x = sc.nextLine();
String y [] = x.split(" ");
String word = sc.next();

int count = 0;

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word)){
      count ++;
    }
}

System.out.print(count);

}
}
