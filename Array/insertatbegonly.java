class M22 {
    int  x [] = new int[5];
    int index=0;

  
        //insert at beginning 
void insertbeg(int v){
for(int i = index ; i>=1 ; i--){
    x[i] = x[i-1];
}
x[0] = v;
index++;
System.out.println("inserted");
}

void show(){
    for(int i=0; i<index ; i++){
        System.out.print(x[i] + " ");
    }
}

    public static void main(String [] args ){

        M22 m22 = new M22();
        m22.insertbeg(70);
        m22.insertbeg(80);

m22.show();
    }  
}

