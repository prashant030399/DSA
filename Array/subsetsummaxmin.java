public class subsetsummaxmin {

    public static void main(String args []){

int x [] = {1,2,3,4,5,6,7,8,9,10};
int s=3; int max=0; int min = x[0]; int sum =0;

for(int i=0 ; i<x.length ; i++){

    if(i%s==0 && i!=0){
        System.out.print(sum + " ");
        max = 0;
        min =x[i];

    }

    if(x[i]> max){
        max = x[i];
    }

    if(x[i]<min){
        min = x[i];
    }

    sum = max + min;


}
System.out.print(sum);

    }
    
}
