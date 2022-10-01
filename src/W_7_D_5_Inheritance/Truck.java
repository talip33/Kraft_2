package W_7_D_5_Inheritance;

public class Truck extends Vehicle{
    int carryingCapasity;
    public void carrying(){
        System.out.println(color+" "+type+" "+carryingCapasity+" yük taşır");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapasity=" + carryingCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
