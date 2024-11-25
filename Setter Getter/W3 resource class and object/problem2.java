//Write a Java program to create a class called "Dog" with a name and breed attribute. 
//Create two instances of the "Dog" class, set their attributes using the constructor and 
//modify the attributes using the setter methods and print the updated values.


class Dog{

private  String name ;
private  String breed;

public Dog(String name , String breed ){
    this.name = name ;
    this.breed = breed ;
}

public void setName(String name){
    this.name = name ;
}


public  void setBreed(String breed ){
    this.breed = breed;
}


public String getName(){
    return name ; 
}

public String getBreed(){
    return breed ;
}

}

class Main{
public static void main(String[] args) {
    

Dog d1 = new Dog("Rambo","Pug");
Dog d2 = new Dog("Blouse","Labra");

System.out.println("Name is : " + d1.getName() + "  "+ "And Breed is : " + d1.getBreed());
System.out.println("Name is : " + d2.getName() + "  "+ "And Breed is : " + d2.getBreed());

d1.setName("RamboRajkumar");
d2.setName("Bloosms");

System.out.println("Updated Name is : " + d1.getName() +  "  "+  "And Breed is : " + d1.getBreed());
System.out.println("Updated Name is : " + d2.getName() + "  "+  "And Breed is : " + d2.getBreed());


}
}