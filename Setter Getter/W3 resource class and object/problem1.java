//Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, 
//and print their name and age.

// i m not using any constructor 

class Person {

private String name;
private int age;

public void setname(String n){
    name = n;
}
public void setage(int a){
    age  = a;
}

public String getname(){
    return name;
}

public int getage(){
   return age;
}

}

class Main{

public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();

p1.setname("Prashant");
p1.setage(25);

p2.setname("Prayag");
p2.setage(26);

System.out.println("Details of first person");
System.out.println(p1.getname());
System.out.println(p1.getage());
System.out.println();

System.out.println("Details of second  person");
System.out.println(p2.getname());
System.out.println(p2.getage());

}
}