import  java.util.*;

public class countupperlowercase  {
    
    public static void  main (String args []){
Scanner sc = new Scanner (System.in);
System.out.print("Enter String x - ");

String  x = sc.nextLine();
int countuppercase =0; int countlowercase = 0; 

for(int i=0 ; i<x.length() ; i++){
if(x.charAt(i)>=65 && x.charAt(i)<=90){
countuppercase ++ ;
}

if(x.charAt(i)>=97 && x.charAt(i)<=122){
    countlowercase ++;
}

}

System.out.println("Total Uppercase - " + countuppercase);
System.out.println("Total Lowercase - " + countlowercase);

        
    }
}
