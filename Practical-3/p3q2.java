final class Product {
    private int id;
    private String name;
    private double price;

    public Product(){}
    public Product(int i, String n, double p) {
        id=i;
        name=n;
        price=p;
    }

    final public void displayDetails() {
        System.out.println("Product Id : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product price : " + price);
    }
}
//The following class will cause error
// class subProduct extends Product{
    
// }

public class p3q2 {
    public static void main(String[] args) {
        Product p=new Product(1, "Racket", 1800);
        p.displayDetails();
    }
}
