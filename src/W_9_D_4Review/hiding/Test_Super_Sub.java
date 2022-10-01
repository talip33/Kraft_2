package W_9_D_4Review.hiding;

import W_9_D_1_Polymorphism.Animal;
import W_9_D_1_Polymorphism.Dog;

public class Test_Super_Sub {
    public static void main(String[] args) {

        Sub sub=new Sub();


        System.out.println(sub.i);
        sub.increment();
        System.out.println(sub.i);
        System.out.println("**************");
        Super spr=new Super();
        System.out.println(spr.i);
        spr.increment();
        System.out.println(spr.i);

        Super spr1=new Sub();
        Sub sub1=(Sub) spr1;
        spr1.increment();
        System.out.println(spr1.i);
//        Animal animal1=new Dog();
//        Dog dog=(Dog) animal1;


    }
}
