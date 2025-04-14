class Counter implements Runnable {
    @Override
    public void run(){
        for(int i=1; i<=10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class p4q5 {
    public static void main(String[] args) {
        Counter c=new Counter();
        Thread t=new Thread(c);
        t.start();
    }
}
