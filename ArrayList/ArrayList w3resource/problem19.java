	//Write a Java program for trimming the capacity of an array list. 

    import  java.util.ArrayList;

    class Problem19 {
    
    public ArrayList <String> colors(ArrayList<String> list){
    
 list.trimToSize();
return list;

    }

    public static void  main (String args[]){
    
    ArrayList <String> l = new ArrayList<> ();
    l.add("Red");
    l.add("Green");
    l.add("Black");
    l.add("Orange");
    l.add(0,"Blue");

    Problem19 x = new  Problem19();

    ArrayList <String> result = x.colors(l);
    System.out.print("Trimmed : " + result); 
    
    }
    }
