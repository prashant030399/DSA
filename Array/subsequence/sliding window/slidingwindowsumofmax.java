public class slidingwindowsumofmax {

    public static void main(String args []){

        int x[] = {10,20,30,40,50,60,70,80,90,100};
        int s=3 ; int sumofmax =0; int max = x[0];

        for(int i=0 ; i<s ; i++){
            if(x[i] > max){
                max = x[i];   
            }
        }
        sumofmax = sumofmax + max;


for (int i=s ; i<x.length ; i++){
    max = x[i];
if(max < x[i]){
    max = x[i];
}
sumofmax = sumofmax + max ;

}
System.out.print(sumofmax);

    }
    
}
