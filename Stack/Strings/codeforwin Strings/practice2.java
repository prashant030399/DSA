import java.util.*;

public class practice2 {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
String x1 = " ";
String y[] = x.split(" ");
int d = 0;
String word = sc.next();

for(int i=0 ; i<y.length ; i++){
    if(y[i].equals(word) && d==0){
      d ++;  
    }
    else {
        x1 = x1 + y[i] + " ";
    }
}
System.out.print(x1);
    }
    
}
