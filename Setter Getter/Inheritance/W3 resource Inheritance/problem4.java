/* Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and 
adds a new method called addEmployee(). */

class Employee {

    private int salary;

    // Constructor to initialize salary
    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an Employee ");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    // Constructor to initialize salary for HRManager
    public HRManager(int salary) {
        super(salary); // Call the Employee class constructor
    }

    @Override
    public void work() {
        System.out.println("Managing Employees");
    }

    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

class Main4 {
    public static void main(String[] args) {

        Employee emp = new Employee(40000);

        HRManager mgr = new HRManager(70000);

        emp.work();
        System.out.println("Employee Salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager Salary: " + mgr.getSalary());

        mgr.addEmployee();
    }
}