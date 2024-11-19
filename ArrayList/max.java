import java.util.*;

class Max {

public List <Integer> findmax(List<Integer>lists){

List <Integer> result1 = new ArrayList<>();
int max =0;
for(int value: lists){
if(max < value ){
max = value  ;
}
}
result1.add(max) ;
return result1;
}



public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    List<Integer> l = new ArrayList<>();
l.add(10);
l.add(20);
l.add(1,40);
l.add(30);
l.add(50);

Max  x = new Max();
List <Integer> result =    x.findmax(l);
System.out.print("Maximum number is : " + result);

}
}