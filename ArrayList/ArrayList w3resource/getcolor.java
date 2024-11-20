//WAP to get elements/color by entering index number
import java.util.*;

class Getcolor {

public String colors(List <String> list){
    Scanner sc = new Scanner(System.in);
 int index = sc.nextInt();

 if(index >= 0 && index < list.size()){
    return list.get(index);
 } else{
    return "Invalid index";
 }

}


    public static void  main (String args[]){
 

        List <String> l = new ArrayList<> ();
        l.add("Red");
        l.add("Yellow");
        l.add("Blue");


        l.add("Purple");
        l.add("Orange");
        l.add("Black");
        
        Getcolor x = new Getcolor();
        String result = x.colors(l);
        System.out.print("The Color is : " +result); 
        
        }

}
