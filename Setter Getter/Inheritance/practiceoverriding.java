class Circle {

protected int a ;

public void  seta(int x){
    a =x;
}

public void show(){
    System.out.println(3.14 * a*a );
}

}

class Square extends Circle {

public  void show(){
super.show();
    System.out.print(a * a);
}

public static void main (String args []){
    Square x = new Square ();
    x.seta(3);
    x.show();

}


}