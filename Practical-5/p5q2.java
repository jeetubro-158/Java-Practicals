interface Transction{
    public default void processTransaction(double amt) {
        System.out.println("Your transaction is processed for : " + amt);
    }
}

interface Alert {
    public default void sendAlert(String message) {
        System.out.println(message);
    }
}

public class p5q2 implements Transction, Alert {
    public static void main(String[] args) {
        p5q2 p=new p5q2();
        p.processTransaction(5000);
        p.sendAlert("Your transaction completed successfully");
    }
}
