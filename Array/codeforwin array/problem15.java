//WAP to merge  two array to third array

import java.util.Scanner;

public class problem15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array a ");
        int sizea = sc.nextInt();
        int a[] = new int [sizea];
        
        for(int i=0 ; i<sizea ; i++){
            a[i] = sc.nextInt();
        }
      
        System.out.print("Enter size of array b ");
        int sizeb = sc.nextInt();
        int b[] = new int [sizeb];
        
        for(int i=0 ; i<sizeb ; i++){
            b[i] = sc.nextInt();
        }

        int c [] = new int [a.length + b.length ] ;
        
        for(int i=0 ; i<a.length ; i++ ){
            c[i] = a[i];
        }

for(int i=0; i<b.length ; i++){
    c[i + a.length] = b[i]; 
}

for(int i=0 ; i<c.length ; i++ ){
    System.out.println(c[i]);
}



    }
    
}
