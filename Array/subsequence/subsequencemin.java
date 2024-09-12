public class subsequencemin {

    public static void main (String args[]){

        int x[] = {1,2,3,4,5,6,7,8,9,10};
int s=3 ;   int min;

for(int i=0 ; i<x.length -s +1  ; i++   ){
min = x[i];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    for(int j=i ; j<i+s ; j++){

    if(min>x[j]){
        min = x[j];
    }

}
    System.out.print(min + " ");      

}   


    }
    
}
