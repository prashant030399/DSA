class Data{

protected int a;
protected int b;

public void seta(int x ){
    a = x;
}
public void setb(int y ){
    b = y;
}
public int geta(){
    return a;
}
public int getb(){
    return b;
}

}

class Data1 extends Data{

protected  int add;

    public void setadd( ){
        add = a +b;
    }

    public int getadd(){
        return add;
    }

}

class Data2 extends Data1{

    protected int sub;

public void setsub(){
    sub = a-b;
}

public int getsub(){
    return sub;
}

}


class Main{

    public static void main(String[] args) {
        
    
Data2 x = new Data2();
x.seta(56);
x.setb(66);
x.setadd();
x.setsub();

System.out.println(x.getadd());
System.out.println(x.getsub());

}}  