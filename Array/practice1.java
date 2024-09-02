class M{
    int  x [] = new   int[5];
    int index = 0; 
   
   
   void insertatstart(int v){
       for(int i=index ; i>= 1 ; i--){
           x[i] = x[i-1];
       }
       x[0] = v;
       System.out.print("inserted");
       index ++;
   }
   
   
   void show(){
   
       for(int i = 0; i<index ; i++){
           System.out.print(x[i] + " ");
       }
   
   }
   public static void main(String args []){
    M x  = new M();
   x.insertatstart(10);
   x.insertatstart(11);
   x.insertatstart(12);
   
   x.show();
   
   
   
   
    }
   }
   