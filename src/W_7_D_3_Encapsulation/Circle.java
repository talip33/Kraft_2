package W_7_D_3_Encapsulation;

public class Circle {
    private double radius;
    private final double PI=3.14;//PI=Math.PI;


    public Circle(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double circleArea(){
        return this.PI*this.radius*this.radius;

    }

    public static double circleArea(double radius){
        return Math.PI*radius*radius;

    }
}
