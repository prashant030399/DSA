	//Write a Java program to shuffle elements in an array list.

    import  java.util.*;

    class Problem10 {
    
    public List <String> colors(List<String> list){
    
Collections.shuffle(list);
return  list;
    
    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Orange");
    l.add("White");
    l.add("Black");
    Problem10 x = new  Problem10();
    List <String> result = x.colors(l);
    System.out.print("All the colors in shuffle : " + result); 
    
    }
    }
