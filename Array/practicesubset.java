import java.util.*;

public class practicesubset{
public static void main (String args []){

int x [] = {1,2,3,4,5,6,7,8,9,10};
Scanner sc = new Scanner (System.in);
System.out.print("Enter number:");
int s = sc.nextInt(); 
int z=0;

for(int i=0; i<x.length ; i++){

        if(i%s==0 && i!=0){
                System.out.print(z + " ");
                z=0;
        }
        z = z + x[i];
}
System.out.print(z);
        }
}