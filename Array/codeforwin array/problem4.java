//Write a Java program to find maximum and minimum element in an array. – using recursion.
import java.util.*;

public class problem4 {

public static int findmax(int x[], int start, int len){

    if(start == len -1){
        return x[start];
    }

    int maxInRest = findmax(x,start + 1, len);

    return Math.max(x[start],maxInRest);

}

public static int findmin(int x[], int start, int len){

    if(start == len -1 ){
        return x[start];
    }

int minInRest = findmin(x, start + 1, len);

return Math.min(x[start], minInRest);

} 



    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int [n];

    for(int i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
}

int max = findmax(x, 0, n);
int min = findmin(x,0,n);

System.out.println("Maximum number : " + max);
System.out.print("Minimum number : " + min);




}   
}



    

  