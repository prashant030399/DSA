public class slidingwindowsum{
public static void main (String args []){

int x[] = {10,20,30,40,50,60,70,80,90,100};
int s=3; int sum=0;

// for the first s number 
for(int i=0 ; i<s ; i++){      
    sum = sum + x[i];
}
System.out.print(sum + " ");

//for all the next s number 
for(int i=s ; i<x.length ; i++){
    sum = sum + x[i] - x[i-s];
    System.out.print(sum + " ");
}




}


}