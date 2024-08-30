class M22 {
    int  x [] = new int[5];
    int index=0;

    void insert(int v){
        if(index>=x.length)
        {
        System.err.println("Overflow");
        }
        else{
            x[index] = v;
            index++;
            System.out.print("inserted ");
        }
        }
        
void show(){
    for(int i=0; i<index ; i++){
        System.out.print(x[i] + " ");
    }
}

    public static void main(String [] args ){

        M22 m22 = new M22();
        m22.insert(10);
        m22.insert(20);

        m22.insert(30);
        m22.insert(40);

        m22.insert(50);
        m22.insert(60);


       
m22.show();

    }
    
}

