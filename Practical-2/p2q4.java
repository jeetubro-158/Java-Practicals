class Student {
    private int studentID;
    private String StudentName;
    private double scholarshipAmount;

    public Student(){
        StudentName="Unknown";
        scholarshipAmount=0.0;
        studentID=0;
    }

    public Student(int id, String sn, double samt) {
        studentID=id;
        StudentName=sn;
        scholarshipAmount=samt;
    }

    public Student(Student s) {
        studentID=s.studentID;
        StudentName=s.StudentName;
        scholarshipAmount=s.scholarshipAmount;
    }
    
    public String getStudentDetails(){
        String details="Student Id : " + studentID + "\n" + "Student Name : " + StudentName + "\n" + 
        "Scholarship Amount : " + scholarshipAmount + "\n";
        return details;
    }

    public void increaseScholarship(double amt) {
        scholarshipAmount+=amt;
        System.out.println("Sholarhsip amount incremented successfully...\n");
    }
}
public class p2q4 {
    public static void main(String[] args) {
        Student s1=new Student(1, "Jeetu", 20000);
        String s1Detials = s1.getStudentDetails();
        System.out.println(s1Detials);
        s1.increaseScholarship(5000);
        System.out.println(s1.getStudentDetails());
    }
}
