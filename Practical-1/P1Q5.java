public class P1Q5 {
    public static void main(String[] args) {
        byte a=10, b=15;
        int sum;
        //In the following expression 'a' and 'b' are promoted to int for addition.
        sum=a+b;
        //Note: this promotion is temporary only limited to the expression.
        System.out.println("Sum : " + sum);
    }
}
