package W_7_D_1_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {

    Okul borsa=new Okul();
    Okul gulsum=new Okul("pembe",550,25);
    Okul sanat=new Okul("kırmızı",250,15);

  gulsum.kontrolKapasite();
        System.out.println(sanat.sinifAdeti);

    }
}
