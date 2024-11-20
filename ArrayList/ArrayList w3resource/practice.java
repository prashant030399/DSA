import java.util.*;

class Practice {

public List <String> colors(List<String> list){

    List <String> result1 = new ArrayList<>();
for(String value :list){
    result1.add(value);
}
return result1;
}

    public static void  main (String args[]){
 
List <String> l = new ArrayList<>();
        
l.add("Purple");
l.add("Blue");
l.add("White");
l.add("Black");
l.add("Orange");
l.add("Red");


        Practice x = new Practice();
        List <String> result = x.colors(l);
        System.out.print("The Colors are : " +result); 
   
}
}