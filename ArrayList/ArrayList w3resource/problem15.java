  	//Write a Java program to join two array lists.

import java.util.*;

    class Problem15 {
    
    public List <String> colors(List<String> list1, List <String> list2){
    
    List <String> result1 = new ArrayList<> ();
  result1.addAll(list1);
  result1.addAll(list2);

  return result1 ;



    }
    public static void  main (String args[]){
    
    List <String> l1 = new ArrayList<> ();
    l1.add("Red");
    l1.add("Green");
    l1.add("Black");
    l1.add("Orange");
    l1.add(0,"Blue");
   
    List <String> l2 = new ArrayList<> ();
    l2.add("Red");
    l2.add("Green");
    l2.add("Orange");
    l2.add(0,"Blue");
    
    Problem15 x = new  Problem15();
    List <String> result = x.colors(l1,l2);
    System.out.print("Joined  : " + result); 
    
    }
    }