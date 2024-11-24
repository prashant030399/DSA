import java.util.*;

class Student {

    private int rollno ;
    private String name;
    private  float marks;

public void setrollno(int r ){
    rollno = r ;
}
public void setname(String n ){
    name = n ;
}
public void setmarks(float m ){
marks = m ;
}

public int getrollno(){
    return rollno;
}
public String getname(){
    return name;
}
public float getmarks(){
    return marks;
}

}

class N{
public static void main(String[] args) {
Scanner sc =new Scanner (System.in);
    
    Student s1 =new Student();
    s1.setrollno(35);
    s1.setname("Prashant");
    System.out.println("Enter Student 1 marks");
    s1.setmarks(sc.nextFloat());

    Student s2 =new Student();
    s2.setrollno(36);
    s2.setname("Priyanshee");
    System.out.println("Enter Student 2 marks");
    s2.setmarks(sc.nextFloat());

    if(s1.getmarks()> s2.getmarks()){
        System.out.println("Prashant has got highest marks ");
    } else{
        System.out.println("Priyanshee has got highest marks ");
    }

}
}