import java.util.Scanner;

public class p2q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Grade : ");
        String grade=sc.nextLine();
        grade=grade.toUpperCase();
        System.out.println("Grade = " + grade);
        double ng=0;
        char c=grade.charAt(0);

        if(c == 'A') { 
            ng=4;
        } else if(c == 'B') {
            ng=3;
        } else if(c == 'C') {
            ng=2;
        } else if(c == 'D') {
            ng=1;
        } else if(c == 'F') {
            ng=0;
        } else {
            System.out.println("*Invalid Input*");
        }
        if(grade.length() > 1 && c != 'F') {
            char sign=grade.charAt(1);
            if(sign == '+' && c != 'A') {
                ng += 0.3;
            } else if(sign == '-') {
                ng -= 0.3;
            }
        }
        System.out.println("Numeric Value : " + ng);



        //This is another way...
        /*
        if(grade.equals("A") || grade.equals("A+")) {
            System.out.println("Numeric Value : " + 4.0);
        } else if(grade.equals("A-")) {
            System.out.println("Numeric Value : " + 3.7);
        } else if(grade.equals("B")) {
            System.out.println("Numeric Value : " + 3.0);
        } else if(grade.equals("B+")) {
            System.out.println("Numeric Value : " + 3.3);
        } else if(grade.equals("B-")) {
            System.out.println("Numeric Value : " + 2.7);
        } else if(grade.equals("C")) {
            System.out.println("Numeric Value : " + 2.0);
        } else if(grade.equals("C+")) {
            System.out.println("Numeric Value : " + 2.3);
        } else if(grade.equals("C-")) {
            System.out.println("Numeric Value : " + 1.7);
        } else if(grade.equals("D")) {
            System.out.println("Numeric Value : " + 1.0);
        } else if(grade.equals("D+")) {
            System.out.println("Numeric Value : " + 1.3);
        } else if(grade.equals("D-")) {
            System.out.println("Numeric Value : " + 0.7);
        } else {
            System.out.println("**Invalid Input**");
        } */

        sc.close();
    }
}
