class Stringprintvowels {

    String x [] = new String [5];
    int rear = -1 , front = -1 ;

    void insert(String val){   
if(rear>=4){
    System.out.print("Overflow" + " ");
} else {
    if(front == -1){
        rear =0; front =0;
    } else {
     rear = rear + 1;   
    }
    x[rear] = val;
    System.out.print("Inserted" + " ");
}
    }


void delete(){
String p = x[rear] ;
int countvowels =0;
for(int i=0; i<p.length() ; i++){
    if(p.charAt(i)=='A' || p.charAt(i)=='E' || p.charAt(i)=='I' || p.charAt(i)=='O' || p.charAt(i)=='U' || p.charAt(i)=='a' ||p.charAt(i)=='e' ||p.charAt(i)=='i' ||p.charAt(i)=='o' || p.charAt(i)== 'u'){
        System.out.print("Vowels - " + p.charAt(i) + " ");
        countvowels ++;
    }
} 
System.out.print("Total Vowels - " + countvowels + " ");
rear --;
}

public static void main (String args []){

    Practice1 x = new Practice1();
    x.insert("Prashant");
    x.insert("Dewangan");
    x.insert("Aniket");
    x.insert("Jas");
    x.delete();
    x.delete();
}
}