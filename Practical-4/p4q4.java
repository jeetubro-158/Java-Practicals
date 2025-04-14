import java.util.*;

public class p4q4 extends Thread{
    @SuppressWarnings("deprecation")
    public void run(){
        while (true) {
            Date d=new Date();
            System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    }
    public static void main(String[] args) {
        p4q4 d=new p4q4();
        d.start();
    }
}
