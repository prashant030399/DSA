public class subsequencesum{
public static void main(String args []){

   int x [] = {1,2,3,4,5,6,7,8,9,10};
   int s=3; int sum=0;

   for(int i=0; i<x.length -s+1 ; i++){
    
for(int j=i ; j<i+s ; j++){
    sum = sum + x[j];
}

System.out.print(sum + " ");
sum =0;


   }
    
}

}
