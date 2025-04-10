import java.util.Scanner;

public class P1Q3 {
    public static void main(String[] args) {
        double percent, tScore;
        boolean crime;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Graduation Percent : ");
        percent=sc.nextDouble();
        System.out.print("Enter your Aptitude Test Score : ");
        tScore=sc.nextDouble();
        System.out.print("Any Criminal Record (ture/flase) : " );
        crime=sc.nextBoolean();

        if(percent >= 60 && tScore >=40  && !crime) {
            System.out.println("You are eligible for Job");
        } else {
            System.out.println("You are not eligible for job");
        }
        sc.close();
    }
}
