class Data{

protected  int a ;
protected int b;

public void seta(int x){
    a =x; 
}

public void setb(int y){
    b=y ;
} 

public int geta(){
    return a ;
}

public int getb(){
    return b ;
}

}

class Even extends  Data{

protected int i;

public void even(){
    
    for(int i=a ; i<=b ;i++){
if(i%2 == 0){
    System.out.print(i + " ");
}
    }
}



}

class Main{
    public static void main(String args []){
Even x = new Even ();
x.seta(10);
x.setb(20);
System.out.print("Even Number : ");

x.even();


    }
}



