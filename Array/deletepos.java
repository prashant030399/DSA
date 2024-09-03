class M{

    int x [] = new int[8];
    int index =0;


    void insertbeg(int v){
        for(int i = index ; i>=1 ; i--){
            x[i] = x[i-1];
        }
        x[0] = v;
        index++;
        System.out.println("inserted");
        }


void deletepos(int pos){
    for(int i = pos-1 ; i<index -1 ; i++ ){
        x[i] = x[i+1];
    }
    index --;

}


    void show(){
        for(int i= 0; i<index ; i++){
            System.out.print(x[i] + " ");
        }

    }


public static void main (String args []){

     M x = new M();
     x.insertbeg(10);
     x.insertbeg(20);
     x.insertbeg(30);
     x.insertbeg(40);
x.show();

     x.deletepos(2);
     x.show();
     



    
}


}
