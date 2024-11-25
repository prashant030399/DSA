//Write a Java program to create a class called "Rectangle" with width and height attributes. 
//Calculate the area and perimeter of the rectangle.


class Rectangle{

    private int width;
    private int height;

public Rectangle(int width , int height){
    this.width = width ;
    this.height = height ; 
}

public int  getWidth(){
    return width ;
}

public int getHeight(){
    return height;
}

public void setWidth(int width){
    this.width = width;
} 

public void setHeight(int height){
    this.height= height;
}

public int getArea(){
    return width * height;
}

public int getPerimeter(){
    return 2*(width + height);
}


}

class Main{

    public static void main(String[] args) {
        
Rectangle x = new Rectangle(6,8);

System.out.println(x.getArea());
System.out.println(x.getPerimeter());

x.setWidth(34);
x.setHeight(45);

System.out.println("Updated Area : " + x.getArea());
System.out.println("Updated  Perimeter  : "+ x.getPerimeter());

    }
}