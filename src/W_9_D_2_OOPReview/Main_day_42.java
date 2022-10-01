package W_9_D_2_OOPReview;

public class Main_day_42 {
    public static void main(String[] args) {


        Daire daire=new Daire();
        System.out.println(daire.alan());
        daire.cevre();
        System.out.println(daire.alan(5));
       daire.setRadius(5);
        System.out.println(daire.alan());
        System.out.println(Daire.alan(6));
        daire.alan();
        Daire.alan(2);//static metot sınıfın metodu
        //(Daire)sınıf adıyla başlar

    }

}
