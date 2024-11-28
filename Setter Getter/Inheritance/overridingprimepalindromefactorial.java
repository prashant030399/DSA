class Prime {

    protected int a ;
    
    public void seta(int x ){
        this.a =x;
    }
    
    public String  isPrime(){
      
        int c =0 ;
    
    for(int i=1 ; i<= a ; i++){
    if( a % i == 0){
        c++;
    }
    }
        if(c ==2){
       return  a + " is a prime No.";
    }
    else {
      return a + " is a non Prime No.";
    }
    
    }
    
    public void  show(){
    System.out.println(isPrime());
    }
    
    }
    class Palindrome extends Prime
    {
           public void show(){
            super.show();
    
            int a1 =a ;
            int rev=0;
    
            while(a1 != 0){
                rev = (rev * 10) + (a1 % 10); 
                a1 = a1 /10;
            }
    
    if(rev ==a ){
        System.out.println(a + " is palindrome no.");
    }
    else {
        System.out.println(a + " is not a palindrome no. ");
    }
           }
    }
    
    class Factorial extends Palindrome {
    
        public void show(){
            super.show();
    
            int f=1 ;
            for(int i=a ; i>=1 ; i--){
    f =  f*i;
            }
    System.out.print("Factorial of "+ a + " is " +f);
        }
    
    public static void main(String[] args) {
        Factorial x = new Factorial();
        x.seta(12);
        x.show();
    
    }
    
    }
    