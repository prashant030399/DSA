class Student{


private int rollno;
private String name;
private double marks1;
private double marks2;
private double marks3;

Student(int r, String n, double m1, double m2, double m3){
    rollno = r ;
    name = n;
    marks1 = m1 ; 
    marks2 = m2 ; 
marks3 = m3 ;
}


public int getrollno(){
     return rollno;
}
public String getname(){
    return name;
}
public double getmarks1(){
    return marks1;
}
public double getmarks2(){
    return marks2;
}
public double getmarks3(){
    return marks3;
}
public double  gettotalmarks(){
    return marks1 + marks2 + marks3;
}


}

class Main{

    public static void main(String[] args) {
        
    
Student s1 = new Student (101,"Prashant",79,89,77);
Student  s2 = new Student (102,"Prayag",77,87,72);
Student  s3 = new Student (103,"Vipul",74,83,71);

System.out.println("Roll No - "+ s1.getrollno());
System.out.println("Name - "+ s1.getname());
System.out.print("Total Marks - "+s1.gettotalmarks());



    }
}
