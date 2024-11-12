//WAP to find reverse of an array

import java.util.Scanner;

public class problem16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array a ");
        int size = sc.nextInt();
        int a[] = new int [size];
        
        for(int i=0 ; i<size ; i++){
            a[i] = sc.nextInt();
        }
      

        for(int i=a.length-1 ; i>=0 ; i--){
        System.out.println(a[i]);
        }



    }}