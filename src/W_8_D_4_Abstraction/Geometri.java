package W_8_D_4_Abstraction;

public abstract class Geometri {
    String nameOfShape;

    public Geometri() {
    }

    public Geometri(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double area();
    abstract String info();
}
class Circle extends Geometri{

    double radius;

    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius= radius;

    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "Name of Shape is "+nameOfShape+",Area is "+area();
    }
}
class Square extends Geometri{
    int a;
    public Square (String nameOfShape,int a) {
        super(nameOfShape);
        this.a=a;
    }

    @Override
    double area() {
        return a*a;
    }

    @Override
    String info() {
        return "Name of Shape is "+nameOfShape+",Area is "+area();
    }
}