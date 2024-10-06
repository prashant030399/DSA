import java.util.*;

public class countword  {

public static void main(String args []){
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();

String y [] = x.split(" ");
int countword =0;

for(int i=0 ; i<y.length ; i++){
countword = countword + 1;
}

System.out.print(countword);

}

}