class M{
    public static void main (String args []){
     
    int [] x = {10,10,10,20,30,40,50,60,100,200};
    int [] c = new int[1000];

        for(int i=0; i<x.length ; i++){
            c[x[i]] ++;
        }


        for(int i=0; i<c.length ;i++){
            if(c[i] !=0){
                System.out.print(i + "-" + c[i] + " " );
            }
        }
        
        

    }
}
