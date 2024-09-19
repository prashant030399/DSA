public class countsetbit {

    public static void main(String args []){

int n=34 ; int set =0;

for(int i=0 ; i<32 ;i++){
    int  k= 1<<i;
    if((n&k) >0){
        set++;
    }
}

System.out.print(set);


    }
    
}
