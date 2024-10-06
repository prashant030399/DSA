import java.util.*;

public class highestalphaword {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
String y [] = x.split(" ");

int max  =0;
String  maxWord = ""; 

for(int i=0 ; i<y.length ; i++){

    if(y[i].length() > max){
        max = y[i].length();
        maxWord = y[i];
    }

}

System.out.print(maxWord + " - ");
System.out.print(max + " alphabets");

    }
    
}
