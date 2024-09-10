public class subsetcountzero {
    public static void  main(String args []){
   
           int x[] = {1,0,0,4,0,6,7,8,9,10,0};
           int s=3; int c=0;
   
           for(int i=0 ; i<x.length ; i++){
   
               if(i%s==0 && i!=0){
           System.out.print(c + " ");
           c=0;
               }
   
       if(x[i]==0){
           c++;
       }
       
           }
   
           System.out.print(c);
   
       }
       
   }
