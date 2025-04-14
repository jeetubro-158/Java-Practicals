package healthclub.Plans_ane_promotions;

public class MembershipPlan {
    private String plan;
    private double price;
    private double discounts;

    public MembershipPlan(){}
    public MembershipPlan(String pl, double pr, double dis) {
        plan=pl;
        price=pr;
        discounts=dis;
    }

    public void disp(){
        System.out.println("Plan : " + plan); 
        System.out.println("Price : " + price);
        System.out.println("Discounts : " + discounts);
    }
}
