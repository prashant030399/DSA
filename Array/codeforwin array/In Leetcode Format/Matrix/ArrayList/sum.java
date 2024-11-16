import java.util.*;

class Sum{

public List <Integer> sumofRows(List <Integer> lists){
    List <Integer> result = new ArrayList<>();
int sum =0;

for(int value : lists){
    sum += value;
}
result.add(sum);
return result ;

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    List <Integer> l = new ArrayList <>();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(1,88);
    
    Sum x = new Sum();
   List <Integer> sumResult =  x.sumofRows(l);   //this line is imp
   System.out.print("Sum of row : " + sumResult.get(0));


}

}