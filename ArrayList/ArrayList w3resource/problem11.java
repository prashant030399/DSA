//Write a Java program to reverse elements in an array list.

    import  java.util.*;

    class Problem11 {
    
    public List <String> colors(List<String> list){
    
    List <String> result1 = new ArrayList<> ();
     for(int i=list.size()-1 ; i>=0 ; i--){
        result1.add(list.get(i));   
     }
    return result1;
    }
    public static void  main (String args[]){
    
    List <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Black");
    l.add("Orange");
    l.add(0,"Blue");
    Problem11 x = new  Problem11();
    List <String> result = x.colors(l);
    System.out.print("All the colors in reverse  : " + result); 
    
    }
    }
