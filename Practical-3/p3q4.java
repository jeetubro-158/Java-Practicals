import java.util.Scanner;

abstract class Figure{
    abstract public void calculateArea();
    Scanner sc=new Scanner(System.in);
}

class Square extends Figure {
    public void calculateArea() {
        System.out.print("Enter the side of Square : ");
        int side=sc.nextInt();
        System.out.println("Area of Square : " + side*side);
    }
}

class Prallelogram extends Figure {
    public void calculateArea() {
        System.out.print("Enter the Base of Parallelograme : ");
        int b=sc.nextInt();
        System.out.print("Enter the Height of Parallelograme : ");
        int h=sc.nextInt();
        System.out.println("Area of Parallelogram : " + b*h);
    }
}

class Ellipse extends Figure {
    public void calculateArea() {
        System.out.print("Enter the radius-1 of ellipse : ");
        int r1=sc.nextInt();
        System.out.print("Enter radius-2 of ellipse : ");
        int r2=sc.nextInt();
        System.out.println("Area of Ellipse : " + (r1*r2)*Math.PI);
    }
}

public class p3q4 {
    public static void main(String[] args) {
        Square s=new Square();
        s.calculateArea();
        Prallelogram p=new Prallelogram();
        p.calculateArea();
        Ellipse e=new Ellipse();
        e.calculateArea();
    }
}
