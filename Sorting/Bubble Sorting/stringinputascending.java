import java.util.*;

public class stringinputascending {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int size = sc.nextInt();

String a[] = new String [size];

for(int i=0 ; i<size ; i++){
    a[i] = sc.next();
}

for(int i=0 ; i<a.length ; i++){
    for(int j=0 ; j<a.length - 1 - i ; j++){
if((a[j].compareTo(a[j+1]))>0){
String c = a[j];
a[j] = a[j+1];
a[j+1] = c;
}
    }
}

for(int i=0 ; i<a.length ; i++){
    System.out.println(a[i]);
}



    }
    
}
