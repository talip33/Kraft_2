package Ev_Variable;

public class tt3107 {
    public static void main(String[] args) {
        int taban = 5, kuvvet = 2;
        long sonuc = 1;
        for (;kuvvet != 0; --kuvvet)
        {
            sonuc *= taban;
        }

        System.out.println("CEVAP = " + sonuc);



        byte a=1;
        byte b=2;
       long c=a+b;
        System.out.println(c);


        int sayi=12%3;
        System.out.println("sonuc="+sayi);


        int sayi1=35+12/3;
        System.out.println("sonuc1="+ sayi1);

        int sayi2=35+12/3%2;
        System.out.println("sonuc2="+ sayi2);

        int sayi3=35+12/3%2*3;
        System.out.println("sonuc3="+ sayi3);

        int sayi4=35+12/3%2*(3-1);
        System.out.println("sonuc4="+ sayi4);

        System.out.println("sayi5="+((35+17%(5-3)*4)));

//ali 1990 dogmuş yas?
        int p_day=2022;
        int b_day=1990;
        int yasAli=p_day-b_day;
        System.out.println("Alinin yasi="+ yasAli);

//        ali 1990 dogumlu,
//        ali ahmetteen 5 yas büyük, ahmet?
        int yasAhmet=yasAli-5;
        System.out.println("Ahmetin yasi="+ yasAhmet);


//        2 cm yarıçapında daire alan ve çevre
        int cap=2;
        final double pi=3.14;
        double alan=pi*(cap*cap);
        double cevre=2*pi*cap;
        System.out.println("Dairenin cevresi "+ cevre+" cm, alani ise "+alan+"cm²dir.");

//300 Fahrenheit kac C dir
        int F=300;
        double C=(F-32)/1.8;
        System.out.println(C);
//        32 C kac F dir
//        double F1=400;
//        double C1;
//        double C1=(F1-32)/1.8;
//        System.out.println(C1);

//        ali fizik 92 kimya 55 mate 89
//            not ort?
//        ortalama sınıf geçme 80 true false?
//int fiz=92,kim=55,mat=89;
//
//int ort=(fiz+kim+mat)/3;
//        System.out.println("ortalama = " + ort);
//        boolean gecme=ort>80;
//        System.out.println("gecme = " + gecme);

//        15 sıra ,her sıra 12 koltuk,113 kişikatılmış
//        salaon kapasite
//        boş koltuk
//        kaç sırada oturulkmakta
//        kaç sıra tamamen boş
//        oturulan sıralarda kaç boş koltuk var
//        int sira=12;
//        int topKap=sira*15;
//        System.out.println("topKap = " + topKap);
//        int katilan =113;
//        int bos_kolt =topKap-katilan;
//        System.out.println("bos_kolt = " + bos_kolt);
//        int exsira= (katilan%12);
//
//        int ot_sira =katilan/12+(katilan%12) +1;
//
//        System.out.println("ot_sira = " + ot_sira);
//        int sn=31502;
//        int dk =sn/60;
//        int saat=dk/60;
//        System.out.println("dk = " + dk);
//        System.out.println("saat = " + saat);
//        int dk1=525%60;
//        System.out.println("dk1 = " + dk1);
//        int sn1 =31502%60;
//        System.out.println("sn1 = " + sn1);
        int i=5,j;
        j=--i;
        System.out.println (j);

        i=i++ + --i + ++i - i--;
        System.out.println(i);


    }
}
