/* Write a Java program to create a class called Shape with a method called getArea(). 
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle. */

class Shape {

protected int l;
protected int b;

public void setl(int x){
    l =x;
}

public void setb(int y){
    b =y;
}

    public void getArea(){
        System.out.println("Get Area");
    }

}

class Rectangle extends Shape {

    public void getArea(){
      
        System.out.print(l *b);
    }

}


class Main3 {
public static void main(String[] args) {
    
Rectangle r = new Rectangle ();

r.setl(20);
r.setb(40);
r.getArea();

}


}