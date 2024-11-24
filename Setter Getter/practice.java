class M{


private int a;

public void seta(int n){
    a =n;
}

public int geta(){
    return a ;
}


}



class N{

    public static void main(String[] args) {
        M x = new M();
        x.seta(20);
System.out.print(x.geta());

    }
}


