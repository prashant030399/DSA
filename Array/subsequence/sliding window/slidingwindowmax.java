public class slidingwindowmax {
    public static void main(String args []){

        int x[] = {10,20,30,40,50,60,70,80,90,100};
        int s=3 ; int max = x[0];

        for(int i=0; i<s ; i++){ 
if(x[i]>max){
max = x[i];
}
        }

        System.out.print(max + " ");
 
        for(int i=s ; i<x.length ; i++ ){
        max = x[i];
       if(x[i]> max){
max = max + x[i] - x[i-s];
       }
       System.out.print(max + " ");

        }

    } 
    
}
