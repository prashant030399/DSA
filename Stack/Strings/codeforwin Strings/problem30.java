//Write a Java program to search all occurrences of a word in given string

import java.util.*;

public class problem30 {
    
public static void main(String args []){

Scanner sc = new Scanner(System.in);

String x = sc.nextLine();
String y [] = x.split(" ");
String word = sc.next();

int c = 0,k=0;

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word)){
        k=x.indexOf(y[i],k+1);
        System.out.println(k);
        c++;
    }
}

if(c==0){
    System.out.print("Word not found");
}

}
}
