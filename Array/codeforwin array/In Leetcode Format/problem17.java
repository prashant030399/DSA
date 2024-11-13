//WAP to put even and odd elements of array in two separate array
import java.util.*;

class Problem17 {

public int [] evenodd(int [] a ){ 

int e =0;
for(int i=0 ; i<a.length ; i++){
    if(a[i] %2 ==0){
        e++;
    }
}

int even [] = new int [e];
e=0;
for(int i=0 ; i<a.length  ; i++){
    if(a[i] %2 ==0){
        even[e] = a[i];
        e++;
    }
}
return even;
}


public int [] oddeven(int [] a ){ 
    int o =0;
    for(int i=0 ; i<a.length ; i++){
        if(a[i] %2 !=0){
             o++;
        }
    }
    int odd [] = new int [o];
    o=0;
    for(int i=0 ; i<a.length  ; i++){
        if(a[i] %2 !=0){
         odd[o] = a[i];
         o++;
        }
    }
    return odd;
    }


public static void main (String args []){
Scanner sc = new Scanner (System.in);
int size = sc.nextInt();

int a [] = new int [size];

for(int i=0 ; i<a.length ; i++){
    a[i] = sc.nextInt();
}

Problem17 x = new Problem17();
int resulteven [] = x.evenodd(a);
System.out.print(Arrays.toString(resulteven));    

int resultodd [] = x.oddeven(a);
System.out.print(Arrays.toString(resultodd));    

}
}
