public class frequencyofnomax {
    public static void main (String args []){

int x [] = {10, 20, 30, 50, 20, 50, 70, 10, 50, 40, 20, 40, 90, 40, 80, 40};
int c [] =new int[100];

int m=0; int z=0;

for(int i=0 ; i<x.length ; i++){
    c[x[i]]++;
}

for(int i=0; i<c.length ; i++){
if(c[i] >m){
m = c[i];
z=i;
}
}
System.out.println("frequ="+m);
System.out.println("Number="+z);


    }    
}
