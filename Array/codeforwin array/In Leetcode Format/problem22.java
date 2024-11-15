//WAP to right rotate an array

import java.util.*;

class Problem22 {
    
    public int [] rightrotate(int []a,int k ){
        for(int i=0; i<k ; i++){
            int n = a[a.length -1];
            for(int j=a.length -1 ; j>0 ; j--){
a[j] = a[j-1];
            }
            a[0] = n;
        }
        return a ;
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();    
        int[] a = new int[size];    
     
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

Problem22 x = new Problem22();
int result [] = x.rightrotate(a,k);
System.out.println(Arrays.toString(result));

}
}
