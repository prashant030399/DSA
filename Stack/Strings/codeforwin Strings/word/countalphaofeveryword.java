import java.util.*;

public class countalphaofeveryword  {

public static void main(String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();

String y [] = x.split(" ");

for(int i=0 ; i<y.length; i++){
    System.out.print(y[i] + " - ");
    System.out.println(y[i].length() );
    
}

}

}