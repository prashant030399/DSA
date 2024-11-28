class Inheritance {

protected int a ;
protected int b;

public void seta(int x){
    a = x;
}
public  int geta(){
    return a;
}

public void setb(int y){
    b = y;
}
public  int getb(){
    return b;
}

}

class Inheritance1 extends Inheritance{

    protected int  add;
public  void setadd(){
add = a +b;
}

public  int getadd(){
    return add ;
}

}


class Main{

    public static void main(String[] args) {
        Inheritance1 x = new Inheritance1();
        x.seta(90);
        x.setb(80);
        x.setadd();
System.out.println(x.getadd());

    }
}