import java.util.*;

public class detecttwointegersign { 
    
    public static void main(String args []){

        Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b= sc.nextInt();


if((a^b)<0){
    
   System.out.print("opposite sign");
} else {
    System.out.print("same sign");
}


    } 
    
}
