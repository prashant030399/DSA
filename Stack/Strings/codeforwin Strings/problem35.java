//WAP to trim leading white space characters from given string  

import java.util.Scanner;

public class problem35 {

public static String trim(String x){  //3
int  index =0;        //4

for(int i=0 ; i<x.length() ; i++){    //5
   if(x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n'){  //6
    index = i; //7 
    break; //8
   }
}
return x.substring(index);  //9
} 

public static void main(String args []){

Scanner sc = new Scanner(System.in);  //1
String x = sc.nextLine();           //2
String trimmed = trim(x);       //10
System.out.print(trimmed);      //11
}    
}
