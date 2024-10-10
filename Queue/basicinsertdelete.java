class Basicinsertdelete  {

    int a [] = new int [5];
    int front = -1 ,  rear = -1;
    
    void insert(int val){
    if(rear >= 4){
        System.out.print("overflow" + " ");
    }
    else
     {
        if(front ==-1 ){
            rear =0; front =0;
        }
        else {
            rear = rear + 1;
        }
    a[rear] = val;
    System.out.print("inserted" + " ");
        
    }
    }


void delete(){
if(rear == -1){
    System.out.print("underflow" + " ");
} else{
System.out.print("delete = " + a[rear] + " ");
rear --;
}

}


    
    void display(){
        for(int i = front ; i<=rear ; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    
    
    public static void main (String args []){
    
    Basicinsertdelete a = new Basicinsertdelete();
    a.insert(10);
    a.insert(20);
    a.insert(30);
    a.insert(40);
    a.insert(50);
    a.insert(60);
    a.insert(70);
    a.display();
    

    a.delete();
    a.delete();
    a.display();


    }
     
    
    }
