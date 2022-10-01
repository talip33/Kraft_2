package W_4_D_2_Class_Object;

public class Daire {

    double yariCap;
    final double PI=3.14;

    public double alanHesaplama(){
        double alan=PI*yariCap*yariCap;

        return alan;
    }
    public double cevreHesaplama(){
        double cevre=2*PI*yariCap;
      return cevre;
    }

}
