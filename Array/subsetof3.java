public class subsetof3 {
    public static void main (String args []){

        int x[] = {10,20,30,4,5,6,7,8,9,10};
        int s=3 ; int z=0;    // z is the sum 

        for(int i=0 ; i<x.length ; i++){
            if(i%s==0 && i!=0){
                System.out.print(z + " ");
                z=0;
            }
            z= z + x[i];
        }

        System.out.print(z + " "); 
        
    }

}   
