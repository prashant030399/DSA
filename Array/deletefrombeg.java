public class deletefrombeg {
    public static void main (String args []){

        int x [] = {10,20,30,40,50,60,70,80,90};

        for(int i=0; i<x.length-1; i++){
            x[i] = x[i+1];
        }

        for(int i=0; i<x.length-1 ; i++){
            System.out.print(x[i] + " ");
        }

        




    }
    
}
