class Car{
    private String model;
    private int year;

    public Car(){}
    public Car(String m) {
        model=m;
    }
    public Car(String m, int y) {
        this(m);
        year=y;
    }

    public void disp() {
        System.out.println("Model : " + model);
        System.out.println("year : "+ year);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    public ElectricCar(){}
    public ElectricCar(String m, int y, int b) {
        super(m, y);
        batteryCapacity=b;
    }

    public void dips() {
        super.disp();
        System.out.println("Battery Capacity : " + batteryCapacity);
    }
}

public class p3q1{
    public static void main(String[] args) {
        ElectricCar e=new ElectricCar("Nexon", 2024, 5);
        e.dips();
    }
}
