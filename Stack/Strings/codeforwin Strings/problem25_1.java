//Write a Java program to replace first occurrence of a character with another in a string.

import java.util.*;

public class problem25_1 {

public static void main (String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();

String y = "";

char oldChar = sc.next().charAt(0);
char newChar = sc.next().charAt(0);
int count =0;

for(int i=0 ;i<x.length() ; i++){
    if(x.charAt(i)  == oldChar){

        y += newChar;  // Replace the first occrrence 
count ++;
        // Add remaining characters from the current index +1 onwards 
        for(int j =i+1 ; j<x.length() ; j++){
            y += x.charAt(j);
        } break;   // exit the loop after the first replacement
    }
        else {
             y += x.charAt(i);  //Add unchanged character
        }
    
}

        // If no replacement occurred (handle cases when oldChar is not found)
      if(count == 0){
        System.out.print("oldChar is not found");
      } else {
        System.out.print(y);
      }




}

}
