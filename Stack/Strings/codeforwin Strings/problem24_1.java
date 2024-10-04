    import java.util.*;

    public class problem24_1 {

    public static void main (String args []){
    Scanner sc = new Scanner (System.in);

    String x = sc.nextLine();
    x = x.toUpperCase();

    String y="";

for(int i=0 ; i<x.length() ; i++){
    boolean b = true;
    char c = x.charAt(i);

for(int j=0 ; j<y.length() ; j++){
    if(c== y.charAt(j)){
        b = false ;
    }
}

if(b == true){
    y = y +c;
}

}


System.out.print(y);


    }
    
}
