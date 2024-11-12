//WAP to count  total number of duplicate elements in an array
import java.util.Scanner;

public class  problem13 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
        int size = sc.nextInt();
        int x [] = new int[size];
        int max =0;
        
        for(int i=0 ; i<size ; i++){
            x[i] = sc.nextInt();
            if(x[i] > max){
                max = x[i];
            }
        }
        
        int count [] = new int[max +1];

        for(int i=0 ; i<x.length ; i++){
    count[x[i]] ++;
}

int repeatedcount =0;
for(int i=0 ; i<count.length ; i++){
if(count[i] > 1){
repeatedcount += (count[i] - 1);
}
}

System.out.print("Duplicate element  is - " + repeatedcount);

}
}

