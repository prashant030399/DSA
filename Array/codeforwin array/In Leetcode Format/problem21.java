//WAP to left rotate an array

import java.util.*;

class Problem21 {

public int [] leftrotate(int []a, int size, int k){    
    for(int i=0 ; i<k ; i++){
    int n = a[k-i-1];
    for(int j=k-1  -i ; j<a.length -i -1 ; j++){
a[j] = a[j+1];
    }
 a[a.length -1 -i ] = n;
}
return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();    
        int[] a = new int[size];
     
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

Problem21 x = new Problem21();
int result [] = x.leftrotate(a,size,k);
System.out.println(Arrays.toString(result));

    }
}

  