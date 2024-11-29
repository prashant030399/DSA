/*Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark. */

//subclass is child class

class Animal {

    public void makeSound(){
        System.out.println("The animal makes a sound");
    }

}

class Cat extends Animal{

    public void makeSound(){
       System.out.print("The cat quarrels ");
    }

}

class Main1 {

    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();

        a.makeSound();
        c.makeSound();

}
}