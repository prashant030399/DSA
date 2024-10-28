//WAP to trim both leading and trailing white space characters from given string 

import java.util.*;

public class problem37 {

public static String trim(String x){
    
    int start =0;
    int end = x.length() - 1;

for(int i=0 ; i<=x.length(); i++){
if(x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n'){
    start =i;
    break;
}
}

for(int i=x.length() -1  ; i>=0 ; i--){
    if(x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n' ){
        end =i;
        break;
    }
} 
return x.substring(start , end+1);
}

public static void main(String args []){
Scanner sc = new Scanner(System.in);
String x = sc.nextLine();
String trimmed = trim(x);
System.out.print(trimmed);

    }
}