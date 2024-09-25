import java.util.*;

public class findpallindrom {
    
public static void main (String args []){

Scanner sc = new Scanner (System.in);
String x  = sc.nextLine();

String reverseString = "";

for(int i=x.length() -1 ; i>=0 ; i--){
    reverseString+=x.charAt(i);
}

if(x.equals(reverseString) ){
    System.out.print("Pallindrom Strings");
} else {
    System.out.print("Not a Pallindrom Strings ");  
}

}

}
