package W_9_D_5_OOP_Review.absraction;

public class Mod2 extends D3Print{
    public Mod2(String model, String fileFormat) {
        super(model, fileFormat);
    }

    @Override
    public void extrude() {
        System.out.println("printing "+model+" with "+fileFormat+ " fileformat");
    }

    @Override
    public void polish() {
        System.out.println(model+" is polshing ");
    }
}
