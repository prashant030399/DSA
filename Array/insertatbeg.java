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



//insert at last
void insertatlast(int v)
{
    x[index] = v;
    index ++;
    System.out.print("inserted ");
}


//insert position
void insertpos(int v, int pos)
{
    for(int i= index ; i>=pos ; i-- ){
        x[i] = x[i-1];
    }
    x[pos - 1] = v;
    index ++;
    System.out.print("inserted");
}


//delete position
void deletepos(int v, int pos){
     

}



//delete at beginning
void deleteatbeg()
{
    System.out.print("delete" + x[0]);

    for(int i=0; i< index -1 ; i++){
        x[i] = x[i+1];

    }
    index --;
}


//delete at last
void deleteatlast()
{
    System.out.print("deleted" + x[index -1]   );
    index --;    
}



void show(){
    for(int i=0; i<index ; i++){
        System.out.print(x[i] + " ");
    }
}

    public static void main(String [] args ){

        M22 x = new M22();
        x.insertbeg(70);
        x.insertbeg(80);
        x.show();
        x.insertatlast(40);
        x.show();
        x.insertpos(33, 2);
        x.show();
        x.deleteatbeg();
        x.show();
        x.deleteatlast();
        x.show();
    }  
}
