	//Write a Java program to empty an array list.

    import  java.util.*;

    class Problem17 {
    
    public List <String> colors(List<String> list){
    
list.removeAll(list);
return list;

    

    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Blue");
l.add("Black");

    Problem17 x = new  Problem17();

    List <String> result = x.colors(l);
    System.out.print("Emptied   : " + result); 
    
    }
    }
