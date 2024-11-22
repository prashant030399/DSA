//Write a Java program to clone an array list to another array list.

    import  java.util.ArrayList;
    import java.util.Collections;

    class Problem16 {
    
    public ArrayList <String> colors(ArrayList<String> list){
    
    
return (ArrayList<String>) list.clone();
    
    }
    public static void  main (String args[]){
    
    ArrayList <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Black");
    l.add("Orange");
    l.add(0,"Blue");

    Problem16  x = new  Problem16();

    ArrayList <String> result = x.colors(l);
    System.out.print("Clone  : " + result); 
    
    }
    }