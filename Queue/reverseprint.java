class Reverseprint {

String x [] = new String [5];
int front = -1 , rear = -1;

void insert(String val){
    if(rear >=4){
        System.out.print("overflow");
    } else {
        if(front == -1){
            rear =0; front =0;
        } else {
            rear = rear + 1;
        }
        x[rear] = val;
        System.out.print("inserted" + " ");
    }
}

void reverse(){
  
    StringBuffer Sb = new StringBuffer(x[rear]);
    System.out.print(Sb.reverse() + " ");
rear--;
}


void display(){
    for(int i= front ; i<=rear ; i++){
        System.out.print(x[i] + " ");
    }
}


public static void main (String args []){

    Reverseprint x = new Reverseprint();
    x.insert("Prashant");
    x.insert("Priyanka");
    x.insert("Kavita");
    x.display();    
    
    x.reverse();
    x.reverse();

}

}
