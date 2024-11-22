//Write a Java program to compare two array lists.

    import  java.util.*;

    class Problem13 {
    
    public List <String> colors(List<String> list1, List <String> list2){
    
    List <String> result1 = new ArrayList<> ();
    for(String  value : list1){
        result1.add(list2.contains(value)? "Yes" : "No");
    }
    return result1;
    
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
    


    Problem13 x = new  Problem13();

    List <String> result = x.colors(l1,l2);
    System.out.print("Compare  : " + result); 
    
    }
    }