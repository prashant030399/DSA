//WAP to put even and odd elements of array in two separate array

import java.util.Scanner;

public class problem17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array a ");
        int size = sc.nextInt();
        int a[] = new int [size];
        
        for(int i=0 ; i<size ; i++){
            a[i] = sc.nextInt();
        }

       int even [] = new int [size];
       int e=0;

       int odd [] = new int [size];
       int o=0;

       for(int i=0 ; i<a.length ; i++){
        if(a[i]%2 == 0 ){
even[e] = a[i];
e++;
        }
else {
    odd[o] = a[i];
    o++;
}
       }
       
       

System.out.print("Even Array - ");
for(int i=0 ; i<e  ; i++){
    System.out.print(even[i] + " ");
}


System.out.print("Odd Array - ");
for(int i=0 ; i<o  ; i++){
    System.out.print(odd[i] + " ");
}



    }}