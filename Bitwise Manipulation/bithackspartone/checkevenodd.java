import java.util.*;

public class  checkevenodd{

    public static void main(String args []){

Scanner sc = new Scanner (System.in);
int n = sc.nextInt();

if((n & 1)!=0){
    System.out.print(n+ " is odd ");
} else {
    System.out.print(n + " is even");
}


    }

}
