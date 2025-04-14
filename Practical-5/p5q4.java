interface Myinterface1 {
    public default void fun(){
        System.out.println("This is from interface-1");
    }
}

interface Myinterface2 {
    public default void fun(){
        System.out.println("This is from interface-2");
    }
}

public class p5q4 implements Myinterface1, Myinterface2 {
    public void fun(){
        Myinterface1.super.fun();
        Myinterface2.super.fun();
        System.out.println("From the fun of p5q4");
    }
    public static void main(String[] args) {
        p5q4 p=new p5q4();
        p.fun();
    }
}
