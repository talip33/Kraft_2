package W_8_D_4_Abstraction;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kuşlar böcek yer");
    }

    @Override
    public void move() {
        System.out.println("kuşlar uçar");

    }

}
