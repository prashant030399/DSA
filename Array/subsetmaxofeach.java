public class subsetmaxofeach{
public static void main(String args []){
 
        int x[] = {1,2,3,4,5,6,7,8,9,10,11};
    int s=3;  int m=0;

for(int i=0; i<x.length ; i++){
if(i%s==0 && i!=0 ){
        System.out.print(m + " ");
        m = x[i];
}

if(x[i] >m){
        m = x[i];
}

    }

    System.out.println(m);
}}
