import java.util.*;

public class reverseword  {

public static void main(String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();

String  [] y = x.split(" ");

for(int i= y.length -1; i>=0 ; i--){
    System.out.print(y[i] + " ");
}

}

}