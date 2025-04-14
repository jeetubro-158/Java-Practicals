interface Calculator {
    public static int add(int a, int b) {
        return (a+b);
    }    
}

public class p5q3 implements Calculator{
    public static void main(String[] args) {
        int sum = Calculator.add(5, 10);
        System.out.println("Sum = " + sum);
    }
}
