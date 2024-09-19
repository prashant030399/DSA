import java.util.*;

public class turnoffkthbit {

public static void main(String args []){
Scanner sc = new Scanner (System.in);

int n = sc.nextInt();
int k = sc.nextInt();

int s = 1<<(k-1);

if( (n&s)==0){
    System.out.print("0");
} else {
    System.out.print("1");
}




    }
}


