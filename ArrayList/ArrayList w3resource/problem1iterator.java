//WAP to create an array list, add some colors (strings) and print out the collections

import  java.util.*;

class Problem1iterator {

public List <String> colors(List<String> list){
List <String> result1 = new ArrayList  <>();

Iterator<String> value  = list.iterator();

while(value.hasNext()){
 result1.add(value.next());
}
return result1 ;    
}

public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Yellow");
l.add("Blue");

Problem1iterator x = new  Problem1iterator();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}
}