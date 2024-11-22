	//Write a Java program to extract a portion of an array list.

    import  java.util.*;

    class Problem12 {
    
    public List <String> colors(List<String> list){
    
return list.subList(0,4);
    

    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Black");
    l.add("Orange");
    l.add(0,"Blue");
    Problem12 x = new  Problem12();
    List <String> result = x.colors(l);
    System.out.print("Few colors : " + result); 
    
    }
    }
