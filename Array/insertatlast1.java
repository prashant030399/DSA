class M22 {
    int  x [] = new int[10];
    int index=0;



//insert at last
void insertatlast(int v)
{
    x[index] = v;
    index ++;
    System.out.print("inserted ");
}




void show(){
    for(int i=0; i<index ; i++){
        System.out.print(x[i] + " ");
    }
}

    public static void main(String [] args ){

        M22 x = new M22();
    
        
     
        x.insertatlast(40);
        x.insertatlast(30);
        x.insertatlast(30);
        x.insertatlast(30);
        x.show();
  
      
     
        

    }  
}
