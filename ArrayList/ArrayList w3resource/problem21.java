	//Write a Java program to replace the second element of an ArrayList with the specified element.

    import  java.util.*;

    class Problem21 {
    
    public List <String> colors(List<String> list){
    
    return list;
    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Black");
    l.add("Orange");
    l.set(1,"Purple");


    Problem21 x = new  Problem21();

    List <String> result = x.colors(l);
    System.out.print("Replaced : " + result); 
    
    }
    }