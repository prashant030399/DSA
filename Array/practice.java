import java.util.*;
public class practice{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int x [] = {10,20,30,40,50,60,70,80,90};

    if(p<1 || p>x.length){
        System.out.print("Invalid Point");

    }
    else{
for(int i = p-1; i< x.length -1 ; i++ ){
    x[i] = x[i+1];
}
    }

    for(int i = 0 ; i<x.length - 1 ; i++){
        System.out.print(x[i] + " ");
    }


    }
}
