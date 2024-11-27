class Shape {

protected   float  a ;
 
public void seta(float x){
    a =x;
 }
public float geta(){
    return a;
}

}
class Circle extends Shape{

    protected float  areacircle;
    
    public void setareacircle(){
        areacircle  =  3.141f*a *a ;
    }
    
    public float getareacircle(){
        return areacircle;
    }   

    }

class Square extends Shape{

    protected float  areasquare;
    
    public void setareasquare(){
        areasquare =  a *a ;
    }
    
    public float getareasquare(){
        return areasquare;
    }   

    }
    
    
class Main{
public static void main(String[] args) {

    
    Square x = new Square();
    Circle y = new Circle();

    x.seta(4);
    y.seta(4);
y.setareacircle();
x.setareasquare();

System.out.println(y.getareacircle());
System.out.print(x.getareasquare());


}


}