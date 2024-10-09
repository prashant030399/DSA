class Stringprintvowels {
    
String x [] = new String [5];
int top =-1 ;

void push(String val){
    if(top>=4){
        System.out.print("overflow");
    } else {
        top ++;
        x[top] = val;
        System.out.print("pushed" + " ");
    }
}

void pop()
{
    if(top==-1)
    {
System.out.print("underflow");
    }
    else
    {
            String p=x[top];
            int countvowels=0;
            for(int i=0;i<p.length();i++)
            {
                System.out.print(p.charAt(i) + " ");
                if(p.charAt(i)=='A'|| p.charAt(i)=='E' || p.charAt(i)=='I'  || p.charAt(i)=='O'|| p.charAt(i)=='U' || p.charAt(i)=='a' || p.charAt(i)=='e'|| p.charAt(i)=='i' || p.charAt(i)=='o' || p.charAt(i)=='u')
                {
                    countvowels++;
                }
            }
System.out.print("Pop "+p+" Total Vowels "+countvowels);
            top--;
    }
}


public static  void main(String args []){

Stringprintvowels x = new Stringprintvowels();
x.push("Prashant");
x.push("Dewangan");
x.push("Hello");
x.push("World");
x.pop();

}
}

