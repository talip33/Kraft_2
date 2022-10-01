package W_7_D_4_Static.staticMethod;

import java.util.Random;

public class Geometric {
    static  int primeter;
    static int counterSide;
    public static void setPrimeter(int... sides){
        for (int i:sides) {
            primeter+=i;
            counterSide++;
        }
        System.out.println("şeklin çevresi = " + primeter);
        System.out.println("şeklin kenar sayısı = " + counterSide);
    }

}
class main2{
    public static void main(String[] args) {

        Geometric.setPrimeter(2,3,generateSide());
    }
    public static int generateSide(){
        Random rm=new Random();
        return rm.nextInt(10);
    }
}
