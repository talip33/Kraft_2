package W_8_D_4_Abstraction;

public class GeometriTest {
    public static void main(String[] args) {
        Circle circle=new Circle("daire",3);
        System.out.println(circle.info());

        Square square=new Square("kare",4);
        System.out.println(square.info());


    }
}
