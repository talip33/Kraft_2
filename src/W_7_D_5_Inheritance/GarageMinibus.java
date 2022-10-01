package W_7_D_5_Inheritance;

public class GarageMinibus {
    public static void main(String[] args) {
        Minibus minibus=new Minibus();

        minibus.type="minibus";
        minibus.color="mavi";
        minibus.seat=14;
        minibus.sellPriceWithTaxt(50000);

        minibus.using();
        minibus.toString();


    }
}class GarageTruck{
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.carryingCapasity=13000;
        truck.type="Kamyon";
        truck.color="kırmızı";
        truck.sellPriceWithTaxt(13000);

        truck.carrying();
        truck.toString();
    }
}
