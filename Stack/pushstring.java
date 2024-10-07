class Pushstring {

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

    void print(){
        for(int i=0 ; i<x.length ; i++){
            System.out.print(x[i] + " ");
        }
    }


public static  void main (String args []){

 Pushstring x = new Pushstring();
 x.push("Prashant");
 x.push("Dewangan");
 x.push("Ankit");
 x.push("Gupta");
 x.push("Ankita");
 x.push("Guptaa");
x.print();
}


}
