package healthclub;
import java.util.*;

public class Member {
    String name, mobileno;
    Date start_date;

    public Member(){}
    public Member(String n, String mn, Date d) {
        name=n;
        mobileno=mn;
        start_date=d;
    }
    @SuppressWarnings("deprecation")
    public void disp(){
        System.out.println("Name : " + name);
        System.out.println("Mobile NO. : " + mobileno);
        System.out.println("Start Date : " + start_date.getDate() + start_date.getMonth() + start_date.getYear());
    }
}
