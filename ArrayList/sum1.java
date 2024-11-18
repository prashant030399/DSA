import java.util.*;

class Sum1{

public List <Integer> sumofRows(List <Integer> lists){
    List <Integer> result = new ArrayList<>();
int sum =0;

for(int i=0 ; i<lists.size() ; i++){  //this line is imp
    sum += lists.get(i);
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
    
    Sum1 x = new Sum1();
   List <Integer> sumResult =  x.sumofRows(l);  
   System.out.print("Sum of row : " + sumResult.get(0));


}

}
