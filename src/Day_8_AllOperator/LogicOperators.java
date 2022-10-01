package Day_8_AllOperator;

import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
       /* boolean sonuc=(5>=4)&&(4==4);

        System.out.println("sonuc = " + sonuc);

        boolean sonuc=(false||true);

        System.out.println("sonuc = " + sonuc);

        boolean sonuc=(true^true);
        System.out.println("sonuc = " + sonuc);


        boolean sonuc=!(5<=4)||!(5>=4);
        System.out.println("sonuc = " + sonuc);

        boolean sonuc=((!false) && true)||false;
        System.out.println("sonuc = " + sonuc);
        int a=5,b=10,c=10;
        boolean sonuc=a>b||b>=c;
        System.out.println("sonuc = " + sonuc);
        int a=5,b=10,c=10;
        boolean sonuc=a>b  ||  b>=c && a<=b;
        System.out.println("sonuc = " + sonuc);
        int a=5,b=10,c=10;
        boolean sonuc=!(a>b  ||  b>=c && !(a>c));
        System.out.println("sonuc = " + sonuc);
        int a=5,b=10,c=10;
        boolean sonuc=!(a>b  ||  b>=c || !(a>c));
        //              !(false|| true ||!false
        //               !(faj  ||    true ||   true )

        System.out.println("sonuc = " + sonuc);
        int a=5,b=10,c=10;
        boolean sonuc=!(a==b  &&  b!=c ^ !(a>c));
        System.out.println("sonuc = " + sonuc);
        int a=5;
        boolean sonuc=a++==5 && --a==11%6;
        int sonuc=a++==5 && --a==11%6;
        System.out.println("sonuc = " + sonuc);

int a=5;
boolean b=true;
boolean sonuc=a++==5&&--a==11%6||!b;
        System.out.println("sonuc = " + sonuc);


        //ÖDEV1
        Scanner scan=new Scanner(System.in);
        System.out.println("10 ile 100 arası bir sayı girin");
        int aSayi=scan.nextInt();
        aSayi=aSayi*=5;
        System.out.println("Bu sayiyi 5 ile çarp  " );
        System.out.println(aSayi);
        System.out.println("Sayıyı ikiye böl");
        aSayi=aSayi/=2;
        System.out.println(aSayi);
        System.out.println("Sayıyı bir arttır");
        aSayi=aSayi+=1;
        System.out.println(aSayi);
        System.out.println("Sayının dörde bölümünden kalanını bul");
        aSayi=aSayi%=4;
        System.out.println(aSayi);
        System.out.println("Bu sayıyı bir azaltın");
        aSayi=aSayi-=1;
        System.out.println("Sonuç "+aSayi);

            //ÖDEV 2
            //Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın.
            // Araba fiyatı üzerinden KDV miktarını
            //hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı)
            // üzerinden ÖTV oranındaki artışı
            //toplam tutara ekleyerek hesaplayın. Çıkan sonuç
            // 700.000 ve üzeri ile 1.000.000 (bir milyon)
            //arasında ise ekrana true yazdırın;


            System.out.println("\n\nAraç fiyatını girin");
            double arac=scan.nextDouble();

            System.out.println("KDV oranını girin");
            double kDV=scan.nextDouble();

            System.out.println("ÖTV oranını girin");
            double öTV=scan.nextDouble();

            double aracKdvli =arac+arac * kDV /100;
            System.out.println("Aracın KDV dahil fiyatı  " +aracKdvli );

            double aracOtvli =aracKdvli + aracKdvli*öTV/100;
            System.out.println("Aracın ÖTV dahil fiyatı "+ aracOtvli);

            boolean sonuc=aracOtvli>=700000 && aracOtvli<1000000;
            System.out.println("sonuc = " + sonuc);*/


//        Ödev 3:
//        Scanner sınıfını kullanarak kullanıcıdan önce String
//        türünde kullanıcının ismini alın ardından
//        double türünde 0-100 arasında 3 sayı alın ;
//        Bu verileri kullanarak
//        1. Ortalama 70 ile 80 arasında ise ekrana true;
//        2. Ortalama 80 ve üzeri ile 90 arasında ise false;
//        3. 90 ve üzeri 100 arasında ise true;
//        4. Tam 100 ise ekrana false yazdırın.

            Scanner scan=new Scanner(System.in);
            System.out.println("\n\nLütfen adınızı yazın");
            String ad=scan.nextLine();
            System.out.println("0-100 arası ilk sayiyi girin");
            int a=scan.nextInt();
            System.out.println("İkinci sayıyı girin");
            int b=scan.nextInt();
            System.out.println("Üçüncü sayıyı girin");
            int c =scan.nextInt();
            int ort=(a+b+c)/3;
            System.out.println("Ortalama = " + ort);
            //1.
            boolean sonuc1= ort>70 && ort<80;
            System.out.println("sonuç1 = "+ sonuc1);
            boolean sonuc2=ort>=80 && ort<90;
            System.out.println("sonuc2 = " + !sonuc2);
            boolean sonuc3=ort>=90 && ort<100;
            System.out.println("sonuç3 = " +sonuc3);
            boolean sonuc4= ort==100;
            System.out.println("sonuc4 = "+ !sonuc4);
















    }
}
