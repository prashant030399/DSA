//WAP to  find reverse of an array

import java.util.*;

class Problem16{

public int [] reverse ( int []a){

  int z=0;
  int [] reversedArray = new int [a.length];
  for(int i=a.length -1   ; i>=0 ; i--){
    reversedArray[z]=a[i];
    z++;
  }
  return reversedArray;

}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();

       int a [] = new int [size];
  
       for(int i=0; i<size ; i++){
           a[i]= sc.nextInt(); 
       }
   
       Problem16 x = new Problem16();
       int result [] = x.reverse(a);
System.out.print(Arrays.toString(result));
       
    }
}