public class frequencyofnoevenodd {
    public static void main (String args []){

        int x [] = {10,20,30,20,10,50,20,10,80,90,20,10};
        int c [] = new int [100];

        for(int i=0 ; i<x.length ; i++){
c[x[i]] ++;
        }

        for(int i=0; i<c.length ; i++){
                    if (c[i] %2==0  && c[i]!=0   ) {
                        System.out.print(i + " ");
                    }  

                }     
    }
}
