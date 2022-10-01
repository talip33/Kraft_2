package W_8_D_4_Abstraction;

public class Cat extends Animal {//concrete somut


    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kediler cok yer");
    }

    @Override
    public void move() {
        System.out.println("kediler iyi koşar");

    }
}
