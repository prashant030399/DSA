import java.util.*;

public class minimumbitreq {

    public static void main(String args []){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();


for(int i=31; i>=0 ; i--){
    int s=1 <<i;

    if( (n &s )!=0  ){
        System.out.print(i+1);
        break;
    }

}

    }}

