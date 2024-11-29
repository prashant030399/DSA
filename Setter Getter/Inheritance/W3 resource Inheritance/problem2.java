/*   Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car that overrides the drive() method to print "Repairing a car". */

class Vehicle {

    public void drive(){
        System.out.println("Repairing a vehicle");
    }

}

class Car extends Vehicle {

    public void drive(){
        System.out.print("Repairing a car");
    }
}

class Main2 {
public static void main(String[] args) {
    Vehicle v = new Vehicle();
Car c = new Car ();

v.drive();
c.drive();

}


}