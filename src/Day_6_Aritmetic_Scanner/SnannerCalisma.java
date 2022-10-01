package Day_6_Aritmetic_Scanner;

import java.util.Scanner;

public class SnannerCalisma {
    public static void main(String[] args) {
       /*Scanner scan=new Scanner(System.in) ;
        System.out.println("lütfen bi kelime girin:");
        String text=scan.nextLine();
        System.out.println("girilen kelime:  "+text);


        System.out.println("lütfen sayi");
        int sayi=scan.nextInt();
        System.out.println("girilen sayi : "+sayi);

        System.out.println("lütfen double");
        double doubleSayi=scan.nextDouble();
        System.out.println("girilen double:" +doubleSayi);


        Scanner scan=new Scanner(System.in);
        System.out.print(" isminiz:");
        String ad=scan.nextLine();
        System.out.printf(" dogum:");
        int yil=scan.nextInt();
        System.out.println(ad+" bey/hanim "+(2022-yil)+" yasindasiniz");


       //  quiz %20,yarı final%30.final %50 yıl sonu notu
       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen quiz notunuzu giriniz: ");
       int quizNotu= scan.nextInt();

        System.out.println("Lütfen yarı final notunuzu giriniz: ");
       int yariFinalNotu= scan.nextInt();

        System.out.println("Lütfen final notunuzu giriniz: ");
       int finalNotu= scan.nextInt();
        System.out.println("Yıl sonu ortalamanız =  " +(quizNotu*0.2+yariFinalNotu*0.3+finalNotu*0.5));
        //ÖDEV1
        Scanner scan=new Scanner(System.in);
        System.out.println("Dairenin alan ve çevre hesaplama aracına hoşgeldiniz." +
                "\nLütfen yarı çapı giriniz.");
        int yariCap= scan.nextInt();
        double Pi= 3.14;
        System.out.println("Alan = " + Pi*yariCap*yariCap);
        System.out.println("Çevre = " + 2*Pi*yariCap);
        //ÖDEV2
        Scanner scan=new Scanner(System.in);
        System.out.println("°F→°C dönüşüm aracına hoşgeldiniz." +
                "\nLütfen °F değerini giriniz.");
        double fahDeger= scan.nextDouble();
        double celDeger=(fahDeger-32)/1.8;
        System.out.println("Sonuç = "+celDeger+" °C");
        //ÖDEV3*/
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Sıra sayısını giriniz : ");
//        int sira = scan.nextInt();
//        System.out.println("Koltuk sayısını giriniz : ");
//        int koltuk = scan.nextInt();
//        System.out.println("Katılımcı sayısını giriniz : ");
//        int katilim = scan.nextInt();
//        int kapasite = sira * koltuk;
//        int bosKoltuk = kapasite - katilim;
//        int oturulanSira = katilim / koltuk + 1;//başka data type gerekli
//        int bosSira = sira - oturulanSira;
//        System.out.println("Salon kapasitesi = " + kapasite + "\nBoş koltuk sayısı = "
//                + bosKoltuk +
//                "\nOturulan sıra sayısı =" + oturulanSira +
//                "\nBoş sıra sayısı= " + bosSira);

      //   ÖDEV4
//       Scanner scan=new Scanner(System.in);
//        System.out.println("Toplam saniyeyi girin:");
//        int toplamSaniye= scan.nextInt();
//        int saat=toplamSaniye/3600;
//        int dakika= toplamSaniye/60%60;
//        int saniye=toplamSaniye/3600%60;
//        System.out.println(toplamSaniye+" saniye: "+saat+" saat "+dakika+" dakika "
//                +saniye+" saniyedir.");


        Scanner scan=new Scanner(System.in);
        System.out.println("Saniye girin");
        int sayi=scan.nextInt();
        int hour=sayi/3600;
        int minute=(sayi-(hour*3600))/60;
        int seconds=(sayi%=60);
        System.out.print( sayi +" saniye\n"+hour+" hour,"+minute+" minutes, and "+seconds+" seconds");
    }
}