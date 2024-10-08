class Stack{

    int x [] = new int [5];
    int top = -1;


    void push(int v){
        if(top>=4){
            System.out.print("overflow");
        } else {
            top++;
            x[top] = v;
System.out.print("pushed" + " ");
        }
    }



}