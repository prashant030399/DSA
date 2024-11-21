//WAP to iterate through all elements in an array list  

import  java.util.*;

class Problem2iterator {

public List <String> colors(List<String> list){
List <String> result1 = new ArrayList  <>();

Iterator <String> l = list.iterator();
while(l.hasNext()){
    result1.add(l.next());
}
return result1;
}

public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("Blue");

Problem2iterator x = new  Problem2iterator();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}
}
