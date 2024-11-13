//WAP to search an element in an array

import java.util.Scanner;

public class problem18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array a ");
        int size = sc.nextInt();
        int a[] = new int [size];
        
        for(int i=0 ; i<size ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Search element : ");
int element = sc.nextInt();

for(int i=0 ; i<a.length ; i++){
    if(a[i] == element){
    System.out.print("Position of " + a[i] + " : " + i + " ");
    }
}


  
    
} }
