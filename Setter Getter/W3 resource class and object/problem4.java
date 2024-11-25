/*Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. Calculate the area and circumference of the circle. */

class Circle{

    private double radius;
    
public Circle(double radius){
    this.radius = radius  ;     
}

public double  getRadius(){
    return radius  ;
}


public void setRadius(double radius){
    this.radius = radius ;
} 

public double getArea(){
    return 3.14 * radius * radius;
}

public double getCircumference(){
    return 2* 3.14 * radius;
}


}

class Main{

    public static void main(String[] args) {
        
Circle x = new Circle(7);

System.out.println(x.getArea());
System.out.println(x.getCircumference());

x.setRadius(35);


System.out.println("Updated Area : " + x.getArea());
System.out.println("Updated  Circumference  : "+ x.getCircumference());

    }
}