	//Write a Java program to print all the elements of an ArrayList using the elements' position.

    import  java.util.*;

    class Problem22 {
    
    public List <String> colors(List<String> list){
    
        List <String> result1 =  new ArrayList<>();
   int no_of_elements = list.size();

   for(int i=0 ; i<no_of_elements ; i++){
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
    l.add("Blue");


    Problem22 x = new  Problem22();

    List <String> result = x.colors(l);
    System.out.print("By Position : " + result); 
    
    }
    }
