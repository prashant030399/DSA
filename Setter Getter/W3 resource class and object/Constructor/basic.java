class Data {

    private int a;
    private int b;

    Data(int x , int y){
        a = x ; b=y;
    }

public int geta(){
    return a;
}
public  int  getb(){;
return b;
}
}
class Main{

public static void main(String[] args) {
    
Data d1 = new Data(8,9);
System.out.println(d1.geta());
System.out.println(d1.getb());




}


}