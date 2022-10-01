package W_9_D_4Review.acces_modifier1;

public class Car1 {
    String model;
    public int year;
    private int door;
    protected double engine;

void method1(){}
public void method2(){}
private void method3(){}
protected void method4(){}
    public Car1() {
    }

    public Car1(String model, int year, int door, double engine) {
        this.model = model;
        this.year = year;
        this.door = door;
        this.engine = engine;
    }
}
