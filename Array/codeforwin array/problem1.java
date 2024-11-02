//WAP to read and print elements of an array using recursion
import java.util.*;

public class problem1 {
    
    public static void printArray(int x[], int start, int len){
        if(start >= len){
            return;
        }
        System.out.println(x[start]);
        printArray(x, start + 1, len);
    }

  
public static void main (String args []){

Scanner sc = new Scanner (System.in);
 int n = sc.nextInt();
 int x [] = new int[n];

 for(int  i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
 }

printArray(x,0,n);

}
}

