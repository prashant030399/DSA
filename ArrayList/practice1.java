import java.util.*;

class Practice1 {
    
public List <Integer> findmax(List<Integer> lists){

    List <Integer> result1 = new ArrayList<>();
    int max = lists.get(0);

    for(int i=0 ; i<lists.size() ; i++){
if(max < lists.get(i)){
    max =lists.get(i);
}        
    }
        
result1.add(max);
return result1;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List <Integer> l = new  ArrayList<>();

    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);

Practice1 x = new Practice1();
List <Integer> result= x.findmax(l);
System.out.print(result);

}
}
