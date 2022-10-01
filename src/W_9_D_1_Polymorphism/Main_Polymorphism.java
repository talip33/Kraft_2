package W_9_D_1_Polymorphism;

public class Main_Polymorphism {

    public static void main(String[] args) {
      Animal animal=new Animal();
      animal.sleep();
      animal.voice();
      animal.eat();
        System.out.println(animal.ayakSayisi);

        System.out.println("------------------");
        //override edilmediyse tüm field ve metotları animaldan alır
      Animal animal2=new Dog();//polymorphism
      animal2.voice();//override edldiği için dog klastan alır
      animal2.eat();
      animal2.sleep();//override edldiği için dog klastan alır
       System.out.println(animal2.ayakSayisi);

        System.out.println("------------------");

        //casting yapılması için
        // önce o türden tanımlamak gerek aynı türler
        // arası casting olur
        Animal animal1=new Dog();
         Dog dog=(Dog) animal1;
         dog.speed();
        System.out.println(((Dog) animal1).disSayisi);
        //animal1 dog gibi davranmaya başlar
        ((Dog) animal1).speed();



    }
}
