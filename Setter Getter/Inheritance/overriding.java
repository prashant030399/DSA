class Circle {

protected int a ;

public  void seta(int x){
    a = x;
}

public void cal(){
    System.out.println(3.14 * a *a);
}

}

class Square extends Circle{
    
public  void cal(){

    super.cal();
    System.out.print(a *a );

}

    public static void main(String[] args) {
        
Square  x  = new Square();
x.seta(7);
x.cal(); 

    }
}