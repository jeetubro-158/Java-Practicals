import java.util.*;

public class p5q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str=sc.nextLine();
        System.out.print("Enter a splitting character : ");
        String sp=sc.nextLine();

        String ss[]=str.split(sp);
        for(int i=0; i<ss.length; i++) {
            System.out.print(ss[i] + " ");
        }
        sc.close();
    }
}
