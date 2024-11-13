//WAP to sort array elements in ascending or descending order 
import java.util.Scanner;

public class problem19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array a ");
        int size = sc.nextInt();
        int a[] = new int [size];
        
        for(int i=0 ; i<size ; i++){
            a[i] = sc.nextInt();
        }

for(int i=0 ; i<a.length ; i++){
    for(int j=0 ; j<a.length - 1-i ; j++){
        if(a[j]> a[j+1]){
            a[j] = a[j] + a[j+1];
            a[j+1] = a[j] - a[j+1];
            a[j] = a[j] - a[j+1]; 
        }
    }
}
System.out.print("Ascending Order : ");
for(int i=0 ; i<a.length ; i++){
    System.out.print(a[i] + " ");
}


for(int i=0 ; i<a.length ; i++){
    for(int j=0 ; j<a.length - 1-i ; j++){
        if(a[j]< a[j+1]){
            a[j] = a[j] + a[j+1];
            a[j+1] = a[j] - a[j+1];
            a[j] = a[j] - a[j+1];
        }
    }
}
System.out.print("Descending Order : " );
for(int i=0 ; i<a.length ; i++){
    System.out.print(a[i] + " ");
}

    }}
