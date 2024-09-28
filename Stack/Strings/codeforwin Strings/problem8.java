//Write a java program to find total number of alphabets, digits or special character in a string

import java.util.*;

public class problem8 {

    public static void main (String args []){

        Scanner sc = new Scanner (System.in);
 String x = sc.nextLine();

 int countalpha =0;
int countdigit =0;
int countsplchar =0;

for(int i=0 ; i<x.length(); i++){

    if((x.charAt(i)>=65 && x.charAt(i)<=90)  || (x.charAt(i)>=97 && x.charAt(i)<=122)){
        countalpha ++;
    }

else if(x.charAt(i)>=48 && x.charAt(i)<=57){
    countdigit ++;
}

else if((x.charAt(i)>=33 && x.charAt(i)<47) || (x.charAt(i)>=58 && x.charAt(i)<=64) ||( x.charAt(i)>=91 && x.charAt(i)<=96  ) || x.charAt(i)>=123 && x.charAt(i)<=126 ){
    countsplchar ++;
}

}

System.out.println("Total Alphabets = " + countalpha);
System.out.println("Total Digits  = " + countdigit);
System.out.println("Total Special Character = " + countsplchar);




    }


}
