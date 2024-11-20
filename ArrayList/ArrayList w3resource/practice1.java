import  java.util.*;

class Practice1 {

public List <String> colors(List<String> list){
List <String> result1 = new ArrayList  <>();

for(int i=0 ; i<list.size() ;i++){
    result1.add(list.get(i));
}
return result1;
}

public static void  main (String args[]){

List <String> l = new ArrayList<> ();
l.add("Red");
l.add("Yellow");
l.add("Blue");

Practice1 x = new  Practice1();
List <String> result = x.colors(l);
System.out.print("All the colors : " + result); 

}
}