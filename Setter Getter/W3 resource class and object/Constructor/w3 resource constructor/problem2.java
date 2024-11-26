/* 2. Parameterized Constructor:
Write a Java program to create a class called Dog with instance variables name and color. 
Implement a parameterized constructor that takes name and color as parameters 
and initializes the instance variables. 
Print the values of the variables. */

class Dog{

    private String name; 
    private String color;

    Dog(String n, String c){
        name =n;
        color=c;
    }

    public String getname(){
        return name;
    }

public String getcolor(){
    return  color;
}

}

class Main{

public static void main(String[] args) {
    
Dog d1 = new Dog("Chandu","Black");
System.out.println("Name - " + d1.getname());
System.out.println("Color - " + d1.getcolor());

}

}