package W_8_D_2_Inhetitance_Cont2;

public class Depo {
    public static void main(String[] args) {
        Fabrika fabrika=new Fabrika();
        fabrika.perAdi="tt";
        fabrika.defaultMetot();//farklı packgelarda ulaşılamaz çalışmaz
        Fabrika.staticDefaultMetot();
    }
}
