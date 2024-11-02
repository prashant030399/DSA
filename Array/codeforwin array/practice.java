public class practice {

static void show(int k ){
    if(k != 0){
        System.out.print(k);
        show(k-1);
    }
}
public static void main(String args [] ){
practice.show(5);

}    
}
