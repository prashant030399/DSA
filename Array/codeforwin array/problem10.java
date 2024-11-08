//WAP to delete an element from an array at specified position             [[size = index]]

import java.util.*;

public class problem10 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        final int MAX_SIZE = 100;
        int x [] = new int[MAX_SIZE];
        
int size = sc.nextInt();

for(int i=0 ; i<size; i++){
    x[i] = sc.nextInt();
}

int pos = sc.nextInt();

if(pos>size+1 || pos<=0){
    System.out.print("invalid position");
} 
else {
    for(int i=pos -1 ; i<size -1 ; i++){
x[i] = x[i+1];
    }
size --;
}
for(int i=0 ; i<size ; i++){
    System.out.print(x[i] + " "); 
}

    }
}
