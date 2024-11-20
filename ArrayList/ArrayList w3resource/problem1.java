//WAP to create an array list, add some colors (strings) and print out the collections

import  java.util.*;

class Problem1 {

public List <String> colors(List <String> list){
List <String> result1 = new ArrayList <> ();

for(String value : list){
    result1.add(value);
}
return result1 ;
}

public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Yellow");
l.add("Blue");

Problem1 x = new  Problem1();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}


}