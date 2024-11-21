//WAP to retrieve an element( at a specified index) from a given array list 

import  java.util.*;

class Problem4 {

public List <String> colors(List<String> list){
Scanner sc = new Scanner(System.in);
    List<String> result1 = new ArrayList<>();
     int index = sc.nextInt();
    
if(index >= 0 && index<list.size()){
    result1.add(list.get(index));
}
return result1 ;


}
public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("Orange");
l.add(0,"Blue");
Problem4 x = new  Problem4();
List <String> result = x.colors(l);
System.out.print("Color is : " + result); 

}
}