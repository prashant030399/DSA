public class subsetminofeach {

public static void main (String args []){

int x [] = {1,2,3,4,5,6,7,8,9,10,11};
int s=3 ; int min = x[0];

for(int i=0 ; i<x.length ; i++){

    if(i%s==0 && i!=0){
    System.out.print(min + " ");
    min = x[i];

    }


if(x[i]<min ){
   min =  x[i];
}


}
System.out.print(min);

}
   
}
