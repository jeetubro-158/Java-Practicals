class Table {
    public synchronized void printTable(int n) {
        System.out.println("Table for : " + n);
        for(int i=1; i<=10; i++) {
            System.out.println(n + "*" + i + "=" + (n*i));
            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class demo extends Thread {
    int n;
    Table t;
    public demo(){}
    public demo(int nn, Table tt) {
        n=nn;
        t=tt;
    }
    public void run(){
        t.printTable(n);
    }
}

public class p4q6 {
    public static void main(String[] args) {
        Table t=new Table();
        demo d1=new demo(5, t);
        demo d2=new demo(10, t);
        demo d3=new demo(15, t);
        demo d4=new demo(20, t);
        demo d5=new demo(25, t);
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
    }
}