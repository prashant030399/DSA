class Practice {

    int a [] = new int[5];
int front = -1 ; int  rear = -1;

void insert(int val){

    if(rear >= 4){
        System.out.print("overflow" + " ");
    }
    else{
        if (front == -1){
            front = 0; rear = 0;
        }
        else{
            rear = rear +1;
        }
        a[rear] = val;
        System.out.print("inserted" + " ");
    }
}


void delete(){
    if(rear == -1){
        System.out.print("underflow");
    } else {
        System.out.print("Delete " + "-" + a[rear] +);
        rear --;
    }
}



void display(){
    for(int i = front ; i<=rear ; i++){
        System.out.print(a[i] + " ");
    }
}


public static void main (String args []){

    Practice x = new Practice();
x.insert(10);
x.insert(20);
x.insert(30);
x.insert(40);
x.insert(50);
x.insert(60);
x.insert(70);
x.display();


x.delete();
x.delete();
x.display();



}




}
