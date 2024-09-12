public class subsequencesumofmax {
    public static void main (String  args []){

        int x[] = {1,2,3,4,5,6,7,8,9,10};
        int s=3; int sumofmax =0; int max;
        
        for(int i=0 ; i<x.length -s +1 ; i++){
max = x[i];
    
for(int j=i; j<i+s  ; j++){
    if(x[j]>max){
        max = x[j];
    }

}

sumofmax =  sumofmax + max    ;

        }
        System.out.print(sumofmax);

    }
    
}
