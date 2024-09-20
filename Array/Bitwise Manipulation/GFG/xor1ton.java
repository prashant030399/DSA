import java.util.*;


public  class xor1ton {

public static void main (String args []){

    Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
for(int i=1 ; i<=n ; i++){
n = 1^n;
}
System.out.print(n);


}

}