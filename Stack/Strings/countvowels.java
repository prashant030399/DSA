import java.util.*;

public class countvowels {

    public static void main (String args []){
Scanner sc = new Scanner(System.in);
System.out.print("Enter String x - ");

String x = sc.nextLine();

int countvowels =0; 

for(int i=0 ; i<x.length() ; i++){
    if(x.charAt(i)=='A' || x.charAt(i) =='E' || x.charAt(i)== 'I' || x.charAt(i)=='O' || x.charAt(i)=='U' || x.charAt(i)=='a' || x.charAt(i) =='e' || x.charAt(i)== 'i' || x.charAt(i)=='o' || x.charAt(i)=='u'  ){
        countvowels ++;
    }
}

System.out.print("Total Vowels - " + countvowels);


    }
    
}
