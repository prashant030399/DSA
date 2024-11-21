//WAP to update  an array element by the given element

import  java.util.*;

class Problem5 {

public List <String> colors(List<String> list){

List <String> result1 = new ArrayList <>();

Iterator <String> l = list.iterator();
while(l.hasNext()){
    result1.add(l.next());
}
return result1 ;
}
public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("Orange");
l.set(1,"Blue");
Problem5 x = new  Problem5();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}
}		