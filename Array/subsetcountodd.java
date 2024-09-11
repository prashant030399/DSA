public class subsetcountodd {
public static void main (String args []){

int x [] = {10,20,3,4,5,7,6,10,8,9};
int s=3; int c=0;

for(int i=0 ; i<x.length ; i++){
    
if(i%s==0 && i!=0){
    System.out.print(c + " ");
    c=0;

}

if(x[i]%2==1){
    c++;
}



}
System.out.print(c);




    }
    
}
