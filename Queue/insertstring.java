class Insertstring {

String x [] = new String [5];
int front = -1; int rear = -1;
    

void insert(String val){

if(rear >=4){
    System.out.print("overflow" + " ");
} else {

    if(front == -1 ){
        rear = 0; front = 0;
    }
    else{
        rear = rear + 1;
    }
    x[rear] = val;
    System.out.print("inserted" + " ");
}

}

void display(){
    for(int i = front ; i<=rear ; i++){
        System.out.print(x[i] + " ");
    }
}
    public static void main (String args []){

    Insertstring x = new Insertstring();
    x.insert("Prashant");
    x.insert("Dewangan");
    x.insert("Ankit");
    x.insert("Gupta");
    x.insert("Vipul");
    x.insert("Ratre");

    x.display();

    


    }
    
}
