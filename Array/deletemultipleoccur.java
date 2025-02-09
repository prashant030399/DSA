import java.util.*;

public class deletemultipleoccur {
public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to be deleted ");
int n= sc.nextInt();

    
int c=0;

int x [] = {10,20,20,30, 30,10,10,40,10,50,60};

for(int i=0 ; i<x.length-c ; i++){
    if(x[i] == n){
        for(int j=i; j<x.length-1-c ; j++ ){
            x[j] = x[j+1];

        }
        c++;
        i--;    
    }

}
for(int i=0 ; i<x.length - c ; i++ ){
    System.out.print(x[i] + " ");
}
}    
}
