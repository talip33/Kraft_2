package W_7_D_5_Inheritance;

public class Minibus extends Vehicle{
    int seat;
    public void using(){
        System.out.println(color+" "+type+" "+seat+" yolcu taşır");
    }


    public String toString() {
        return "Minibus{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
