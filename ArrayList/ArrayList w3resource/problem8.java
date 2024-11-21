//WAP to sort a given array list 

import  java.util.*;

class Problem8 {

public List <Integer> sortednumber(List<Integer> list){

Collections.sort(list);
return list;
}
public static void  main (String args[]){

List <Integer> l = new ArrayList<> ();
l.add(10);
l.add(3);
l.add(4);
l.add(1);
l.add(0,55);
Problem8 x = new  Problem8();
List <Integer> result = x.sortednumber(l);
System.out.print("Sorted Numbers : " + result); 

}
}
    