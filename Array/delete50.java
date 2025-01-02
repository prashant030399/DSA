import java.util.*;

public class delete50 {
    public static void main(String args []){
    

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] x = {10,20,30,40,50,60,70,80,90};

        //would go through every number
        for(int i=0; i<x.length; i++){

            //check if input number matches with that particular number
            if(x[i] ==n){

                //if matched its position would be increased by 1
     for(int j=i; j<x.length-1; j++){
    x[j] = x[j+1];
  }
            }
        }

        // print the updated one 
        for(int i=0 ; i<x.length-1 ;i++){
            System.out.print(x[i] + " ");
        }
        
        }  
}    
