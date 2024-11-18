import java.util.*;

class Sort{

public List<Integer> sortRows(List<Integer> lists){

Collections.sort(lists);
return lists;

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    List<Integer> l = new ArrayList <>();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(1,88);
    
    Sort x = new Sort();
   List<Integer> sortResult =  x.sortRows(l);   //this line is imp
   System.out.print("Sorted Rows : " + sortResult);


}
}