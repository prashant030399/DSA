public class subsequencemax_1 {
    public static void main(String args []){
    
    int x[] = {1,2,3,4,5,6,7,8,9,10};
    
    int s=3; int max = x[0] ;
    
    for(int i=0 ; i<x.length -s +1 ; i++){

        for(int j=i ; j<i+s ;j++){
            
            if(x[j]>max){
                max = x[j];
            }
    
        }
        
        System.out.print(max + " ");
        max = x[0];
        
    }
    
    
        }
        
    }
    