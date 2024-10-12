class Insertdeletestring {

    String x [] = new String [5];
    int front = -1 , rear = -1;

void insert(String val){

    if(rear >= 4){
        System.out.print("overflow" + " ");
    } else {
        if(front == -1){
            rear = 0 ; front =0;
        } else {
            rear = rear + 1;
        }
        x[rear] = val;
        System.out.print("inserted" + " ");
    }
}

void delete(){

    if(rear == -1){
        System.out.print("underflow" + " ");
    } else {
        System.out.print("Delete = " + x[rear] + "  ");
        rear --;
    }

}

void display(){
for(int i = front ; i<= rear ; i++){
    System.out.print(x[i] + " ");
}
}

public static void main (String args []){

    Insertdeletestring x = new Insertdeletestring();
    x.insert("Prashant");
    x.insert("Dewangan");
    x.insert("Ankit");
    x.insert("Gupta");
    x.insert("Vipul");
    x.insert("Ratre");
    x.display();

    x.delete();
    x.delete();
    x.display();
} 

}


