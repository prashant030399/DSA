class Stack {

    int [] x = new int [5];
    int top = -1;

    void push (int val ){
        if(top>=4){
            System.out.print("overflow" + " ");
        }
        else {
            top ++;
            x[top] = val;
            System.out.print("pushed" + " ");
        }
    }


    void pop(){
        if(top==-1){
            System.out.print("under flow" + " ");
        } else {
            System.out.print("pop=" + x[top] + " ");
            top--;
        }
    }


    void print(){
        for(int i=top; i>=0 ; i--){
            System.out.print(x[i] + " ");
        }
    }


    
public static void main(String args []){

Stack s = new Stack();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.push(60);
s.push(70);
s.print();


s.pop();
s.pop();
s.pop();
s.print();

    
}

}
           




