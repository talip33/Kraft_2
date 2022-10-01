package W_7_D_5_Inheritance;

public class Vehicle {
    String type;
    double price;
    String color;
    public void sellPriceWithTaxt(double price){
        price+=price*0.10;
        System.out.println(price);
    }

}
