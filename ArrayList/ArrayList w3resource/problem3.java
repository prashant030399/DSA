//WAP to insert an element into the array list at the first position

import  java.util.*;

class Problem3 {

public List <String> colors(List<String> list){
List <String> result1 = new ArrayList  <>();

for(String value  : list){
result1.add(value);
}
return result1;
}
public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("Orange");
l.add(0,"Blue");
Problem3 x = new  Problem3();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}
}