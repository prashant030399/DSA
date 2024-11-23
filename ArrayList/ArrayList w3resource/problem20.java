	//Write a Java program to increase an array list size.

    import  java.util.*;


    class Problem20 {
    
    public List <String> colors(List<String> list){
    
return list; 
   
    
    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> (4);
    l.add("Red");
    l.add("Green");
    l.add("Black");
    l.add("Orange");
((ArrayList<String>)l).ensureCapacity(5);
l.add("White");

    Problem20 x = new  Problem20();

    List <String> result = x.colors(l);
    System.out.print("In Increased Size  : " + result); 
    

    }
    }
