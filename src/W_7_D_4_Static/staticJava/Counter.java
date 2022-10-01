package W_7_D_4_Static.staticJava;

public class Counter {

    static int counter;

    public Counter() {
      counter++;
        System.out.println(counter);
    }
}

class main{
    public static void main(String[] args) {
        Counter ct1=new Counter();
        Counter ct2=new Counter();
        Counter ct3=new Counter();


    }
}