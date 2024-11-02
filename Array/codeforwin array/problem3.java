//Write a java program to find sum of all array elements. – using recursion.

import java.util.*;

public class problem3 {

public static int sumofarray(int x[], int start, int len){
if(start >= len){
    return 0;
}
return x[start] + sumofarray(x, start + 1, len);
}
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int [n];

    for(int i=0 ; i<n ; i++){
    x[i] = sc.nextInt();
}

int sum  = sumofarray(x,0,n);
System.out.print(sum);

}   
}
