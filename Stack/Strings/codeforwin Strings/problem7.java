// Write a java program to toggle case of each character of a String  

public class problem7 {

 public static void main(String[] args) {
        
        String x = "Prashant";
String y="";
        for(int i=0; i<x.length(); i++){

            char p = x.charAt(i);
if(p>=65 && p<=90){
    y = y + ((char)(p+32));
}
else if(p>=97 && p<=122){
    y = y + ((char)(p-32));
}
        }
System.out.print(y);
        



    }
    
}
