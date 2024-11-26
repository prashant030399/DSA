/*1. Default Constructor:
Write a Java program to create a class called "Cat" with instance variables name and age. 
Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
Print the values of the variables. */

//default  constructor  means without arguement or parameter 

class Cat{

private String name;
private int age;

Cat(){
name = "Unknown";
age = 0;
}

public String  getname(){
    return name ;
}

public  int getage(){
    return age;
}

}

class Main{
    public static void main(String[] args) {
        
Cat c = new Cat();
System.out.println(c.getname());
System.out.println(c.getage());


    }
}