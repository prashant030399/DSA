//WAP to sort array elements in ascending or descending order

import java.util.*;

 class Problem19 {
 
    public int []ascendingOrder(int a[]){

        for(int i=0; i<a.length ; i++){
            for(int j=0 ; j<a.length -1 -i ; j++){
                if(a[j]> a[j+1]){
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
        }

return a ;
    }

    public int []descendingOrder(int a[]){

        for(int i=0; i<a.length ; i++){
            for(int j=0 ; j<a.length -1 -i ; j++){
                if(a[j]< a[j+1]){
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
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

Problem19 x = new Problem19();
int result [] = x.ascendingOrder(a);
System.out.println(Arrays.toString(result));

int result1 [] = x.descendingOrder(a);
System.out.print(Arrays.toString(result1));

}
 }