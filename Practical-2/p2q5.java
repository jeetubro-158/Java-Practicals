import java.util.Scanner;

class VacationPackage{
    private String packageId;
    private int numAdults=0;
    private int numChildren=0;
    private int tripDistance=0;
    private float totalCost=0f;

    public void calculateCost(int na, int nc, int td) {
        if(td >= 1000) {
            totalCost=(na*500) + (nc*250);
        } else if(td >= 500 && td < 999) {
            totalCost=(na*300) + (nc*150);
        } else {
            totalCost=(na*200) + (nc*100);
        }
    }

    public void setPackageDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Package Id : ");
        packageId = sc.nextLine();
        System.out.print("Enter Number of Adults : ");
        numAdults=sc.nextInt();
        System.out.print("Enter Number of Children : ");
        numChildren=sc.nextInt();
        System.out.print("Enter trip Distance (in km): ");
        tripDistance=sc.nextInt();
        calculateCost(numAdults, numChildren, tripDistance);
        sc.close();
    }
    
    public void displayPackageDetail() {
        System.out.println("\nPackage Id : " + packageId);
        System.out.println("Number of Adults : " + numAdults);
        System.out.println("Number of Children : " + numChildren);
        System.out.println("Trip Distance : " + tripDistance);
        System.out.println("Total Cost for your trip : " + totalCost);
    }
}

public class p2q5 {
    public static void main(String[] args) {
        VacationPackage v=new VacationPackage();
        v.setPackageDetails();
        v.displayPackageDetail();
    }
}
