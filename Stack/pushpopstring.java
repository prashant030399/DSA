class Pushpopstring {

    String x [] = new String [5];
    int top = -1 ; 
    
    void push (String val){

        if(top>=4){
            System.out.print("Overflow" + " ");
        } else {
            top ++;
x[top] = val;
System.out.print("pushed"+ " ");
        }
    }

void pop(){
    if(top == -1 ){
        System.out.print("underflow");
    } 
    else {
        System.out.print("pop - " + x[top] + " ");
        top --;
    }
}


    void print(){
        for(int i=0 ; i<x.length ; i++){
            System.out.print(x[i] + " ");
        }
    }


public static  void main (String args []){

 Pushpopstring x = new Pushpopstring();
 x.push("Prashant");
 x.push("Dewangan");
 x.push("Ankit");
 x.push("Gupta");
 x.push("Ankita");
 x.push("Guptaa");
x.print();


x.pop();
x.pop();
x.pop();
x.print();



}


}
