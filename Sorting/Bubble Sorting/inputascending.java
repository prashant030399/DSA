import java.util.*;

public class inputascending {

public static void main(String[] args) {
        
Scanner sc = new Scanner (System.in);
int size = sc.nextInt();
int a[] = new int [size];

for(int i=0 ; i<size ; i++){
a[i] = sc.nextInt();
}

for(int i=0 ; i<a.length ; i++){
    for(int j=0 ; j<a.length - 1 - i ; j++){
        if(a[j]> a[j+1]){
            a[j] = a[j] + a[j+1];
            a[j+1] = a[j]  - a[j+1];
            a[j] = a[j] - a[j+1];
        }
    }
}

for(int i=0 ; i<a.length ; i++){
    System.out.print(a[i] + " ");
}


    }
    
}
