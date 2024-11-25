 /*  Write a Java program to create a class called "Employee" with a name, job title, 
 and salary attributes, and methods to calculate and update salary.*/ 
 
 class Employee{

    private String name ;
    private String jobtitle ;
    private double salary ;

public void setname(String n){
    name =n;
}
public void setjobtitle(String j){
    jobtitle =j;
}
public void setsalary(double s){
    salary =s ;
}

public String getname(){
    return name;
}
public String getjobtitle(){
    return jobtitle;
}
public double  getsalary(){
    return salary;
}

public void raisesalary(double percentage){
    salary +=  salary * percentage /100;
}

public  void printEmployeeDetails(){
    System.out.println("Name - " + name);
    System.out.println("Jobtitle - " + jobtitle);
    System.out.println("Salary - " + salary);
}

 }
class Main {

public static void main(String  args []){

Employee e1  = new Employee();
Employee e2  = new Employee();
e1.setname("Prashant");
e1.setjobtitle("Software Developer");
e1.setsalary(150000);
e2.setname("Prayag");
e2.setjobtitle("Cyber Security Analyst ");
e2.setsalary(90000);




e1.printEmployeeDetails();
e2.printEmployeeDetails();




e1.raisesalary(8);
e2.raisesalary(12);
System.out.println();
System.out.println("After raising salary ");

e1.printEmployeeDetails();
e2.printEmployeeDetails();


}
}
