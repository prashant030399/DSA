//WAP to trim trailing white space characters from given string 

import java.util.*;

public class problem36 {
    
public static String trim(String x){
    int index = x.length() -1;
    for(int i=x.length() - 1 ; i>=0 ; i--){
    if(x.charAt(i) != ' ' && x.charAt(i) != '\t' && x.charAt(i) != '\n'){
        index = i;
        break;
    }
    }
    return x.substring(0,index+1);
} 

public static void main (String args []){
Scanner sc = new Scanner(System.in);
String x = sc.nextLine();
String trimmed = trim(x);
System.out.print(trimmed);

}
}
