//WAP to delete duplicate elements from array

import java.util.*;

public class problem14 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int x [] = new int [size];
        int c=0;
    
    for(int i=0 ; i<size ; i++){
        x[i] = sc.nextInt();
    }

for(int i=0 ; i<x.length - c ; i++){
for(int j= i+1 ; j<x.length - c ; j++){
    if(x[i] == x[j]){
        for(int k=j; k<x.length - 1 - c ; k++){
            x[k] = x[k+1];
        }
     c++;
j--;
    }
}
}

for(int i=0 ; i<x.length -c ; i++ ){
    System.out.println(x[i]);
}

}
}