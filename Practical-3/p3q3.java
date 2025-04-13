class Employee {
    protected String name;
    protected double salary;

    public Employee(){}
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    
    public void disp() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    protected String dept;

    public Manager(){}
    public Manager(String n, double s, String d) {
        super(n, s);
        dept=d;
    }

    public void disp() {
        super.disp();
        System.out.println("Department : " + dept);
    }
}

class Executive extends Manager{
    private String location;

    public Executive(){}
    public Executive(String n, double s, String d, String l) {
        super(n, s, d);
        location=l;
    }
    
    public void disp() {
        super.disp();
        System.out.println("Location : " + location);
    }
    
}

public class p3q3 {
    public static void main(String[] args) {
        Executive e1=new Executive("Jeetu...", 100000, "IT", "Ulahsnager");
        e1.disp();
    }
}
