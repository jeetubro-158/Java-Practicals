import java.util.Date;
import healthclub.*; 
import healthclub.Plans_ane_promotions.*;

public class p5q1 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date d=new Date(2025, 3, 5);
        Member m=new Member("Manoj", "8421943478", d);
        m.disp();
        MembershipPlan p=new MembershipPlan("Muscle Building", 500, 10);
        p.disp();
    }
}
