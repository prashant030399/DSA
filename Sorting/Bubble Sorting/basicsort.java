public class basicsort {

public static void main(String args []){

    int a[] = {5,4,3,20,1};
for(int i=0; i<a.length ; i++){
    for(int j=0 ; j<a.length-1-i ; j++){
        if(a[j]>a[j+1]){
            int c = a[j];
            a[j] = a[j+1];
            a[j+1] = c;
        }
    }
}

for(int i=0 ; i<a.length; i++){
    System.out.print(a[i] + " ");
}


}
    
}