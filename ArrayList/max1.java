import java.util.*;

class Max1 {

public List <Integer> findmax(List<Integer>lists){

    
List <Integer> result1 = new ArrayList<>();
int max =lists.get(0);
for(int i=0 ; i<lists.size() ; i++){
    if(lists.get(i) > max){
        max = lists.get(i);
    }
}
result1.add(max);
return result1;
}

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    List<Integer> l = new ArrayList<>();
l.add(10);
l.add(20);
l.add(1,40);
l.add(30);
l.add(50);

Max1  x = new Max1();
List <Integer> result =    x.findmax(l);
System.out.print("Maximum number is : " + result);

}
}
