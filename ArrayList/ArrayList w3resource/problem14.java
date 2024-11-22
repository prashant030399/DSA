	//Write a Java program that swaps two elements in an array list.

    import  java.util.*;

    class Problem14 {
    
    public List <String> colors(List<String> list){
    
Collections.swap(list,0,2);
return list;

    

    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Blue");
l.add("Black");

    Problem14 x = new  Problem14();

    List <String> result = x.colors(l);
    System.out.print("Swaped  : " + result); 
    
    }
    }
