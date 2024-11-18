import java.util.*;

class Reverse {    
public List <Integer> reverse(List <Integer> lists){

    List <Integer> result1 = new ArrayList<>();

    for(int i=lists.size() -1  ; i>=0 ; i--){
        result1.add(lists.get(i));  //Add elements to the result list
    }
return result1;
}

public static void main (String args []){

        Scanner sc = new Scanner(System.in);
            List<Integer> l = new ArrayList <>();
            l.add(10); 
            l.add(20);
            l.add(30);
            l.add(40);
            l.add(1,88);

            Reverse x = new Reverse();
            List <Integer> result =  x.reverse(l);
            System.out.print(result);

}
}
