	//Write a Java program to test whether an array list is empty or not.

    import  java.util.*;

    class Problem18 {
    
    public List <String> colors(List<String> list){
    list.removeAll(list);
    return list;
    }

    public boolean isArraylistEmpty(List<String> list){
    return list.isEmpty();
    }


    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Blue");
l.add("Black");

    Problem18 x = new  Problem18();

    List <String> result = x.colors(l);
  System.out.print("Checking if the arraylist is empty : " + x.isArraylistEmpty(result));


    
    }
    }