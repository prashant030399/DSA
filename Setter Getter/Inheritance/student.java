class Student{

private int rollno;
private String name ;
private String branch;
private int semester ;

public void setrollno(int r ){
    rollno = r;
}

public void setname(String n){
    name = n;
}

public void setbranch(String b){
    branch = b;
}

public void setsemester(int s){
    semester = s;
}

public int getrollno(){
    return rollno;
}

public String getname(){
    return name;
}

public String getbranch(){
    return branch; 
}

public int getsemester(){
    return semester; 
}

}

class Marks extends Student {

private float marks1;
private float marks2;
private float marks3;
private float total;

public void setmarks1(float m1){
    marks1 = m1;
}
public void setmarks2(float m2){
    marks2 = m2;
}
public void setmarks3(float m3){
    marks3 = m3;
}
public void settotal(){    // this  is imp
    total = marks1 + marks2 + marks3 ;
}

public float getmarks1(){
    return marks1;
}

public float getmarks2(){
    return marks2;
}

public float getmarks3(){
    return marks3;
}

public float gettotal(){
    return total;
}

}

class Main {

public static void main(String[] args) {
    
Marks m = new Marks();
m.setrollno(101);
m.setname("Prashant");
m.setbranch("ETC");
m.setsemester(5);
m.setmarks1(78);
m.setmarks2(89);
m.setmarks3(97);
m.settotal();

System.out.println("Roll No. - " +m.getrollno());
System.out.println("Name - " +m.getname());
System.out.println("Branch - " +m.getbranch());
System.out.println("Semester - " +m.getsemester());
System.out.println("Marks 1  - " +m.getmarks1());
System.out.println("Marks 2  - " +m.getmarks2());
System.out.println("Marks 3  - " +m.getmarks3());
System.out.println("Total Marks - " +m.gettotal());

}
}