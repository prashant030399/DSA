//WAP to remove third element from an array list 

import  java.util.*;

class Problem6 {

public List <String> colors(List<String> list){

List<String> result1 = new ArrayList<>();
for(String value : list){
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
l.remove(2);
Problem6 x = new  Problem6();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}
}		