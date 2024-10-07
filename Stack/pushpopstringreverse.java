class Pushpopstringreverse {

    String x [] = new String [3];
    int top = -1 ; 
    
    void push (String val){

        if(top>=2){
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
        StringBuffer Sb = new StringBuffer(x[top]);
        System.out.print(Sb.reverse()+ " " );
        top --;
    }
}


    void print(){
        for(int i=0 ; i<x.length ; i++){
            System.out.print(x[i] + " ");
        }
    }


public static  void main (String args []){

 Pushpopstringreverse x = new Pushpopstringreverse();
 x.push("Prashant");
 x.push("Dewangan");
 x.push("Ankit");
 x.push("Gupta");

x.print();


x.pop();
x.pop();
x.print();



}


}
