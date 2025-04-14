class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Student {
    int rollno, age;
    String name, course;

    public Student(){}
    public Student(int r, String n, int a, String c) throws AgeException {
        rollno=r;
        name=n;
        course=c;
        if(a<15 || a>21) {
            AgeException e=new AgeException("Age not within the range");
            throw e;
        } else {
            age=a;
        }
    }

    public void disp(){
        System.out.println("Roll NO. : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);        
    }

}

public class p4q3 {
    public static void main(String[] args) throws AgeException {
        try{
            Student s=new Student(62, "Jeetu", 91, "IT");
            s.disp();
        } catch(AgeException e) {
            System.out.println(e);
        }
    }
}
