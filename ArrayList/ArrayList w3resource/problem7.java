//WAP to search for an element in an array list 

import  java.util.*;

class Problem7 {

public List <Integer> colors(List <String> list){
Scanner sc = new Scanner (System.in);

String color = sc.next();
List <Integer> result1 = new ArrayList<>();

for(int i=0 ; i<list.size() ; i++){
if(color.equals(list.get(i))){
    result1.add(i);
}
}

if(result1.isEmpty()){
    System.out.print("Color not found");
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

Problem7 x = new  Problem7();
List <Integer> result = x.colors(l);

if(!result.isEmpty()){
    System.out.print("Index is : " + result);
}



}
}		