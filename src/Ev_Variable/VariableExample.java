package Ev_Variable;

import java.util.Scanner;

public class VariableExample {
    public static void main(String[] args){
        //byte
      /*byte sayi=1;
        sayi=56;
        System.out.println(sayi);


        //short
        short sayi2=32000;
        //System.out.println(sayi2);
        sayi2=31000;
       // System.out.println(sayi2);
        short sayi3=3000;
        System.out.println(sayi2+sayi3);

        //int
        int sayi4;
        sayi4=50;
        System.out.println(sayi4);

        //long
        long sayi6=565555555111155111L;
        //float
        float a=1.2f;

        //double
        double b=5.2;
        System.out.println(a+b);

        //boolean
        boolean devam=true;
        devam=false;
        System.out.println(devam);
        boolean a=3>4;
        System.out.println(a);


        //char
        char b=65;
        b='g';

        System.out.println(b);

        //String
        String a="talip ";
        //System.out.println(a);
        String b="tıras";
       // System.out.println(a+" "+b);
        int c=5;
        System.out.println(a+c);


        int yil=2022, yas=20;
        String isim="Ahmet";
        System.out.println(yil+" de "+ isim+" "+yas + " yasinda olacak.");


        double i=5,j=10;
        System.out.println(i);

       // int i;
       // int j;
        int i,j;
        j=5;
        i=j;
        System.out.println(i);

        int i,j,k;
        i=5;
        j=10;
        k=i;
        i=j;
        System.out.println(""+i+j+k);

        double a,b;
        a=10.9;
        b=20.3;
        double c=b*a;

        System.out.println(c);

        float a=10,b=25,c;
        c=(a+b)/2;
        System.out.println("ortalama:"+c);

        double a=10.9;
        String b="yakup";
        System.out.println(a+" "+b);

int a=5;
int b=++a + --a* ++a;

//   6        5   6
        System.out.println("b = " + b);

        double sy=10;
        sy-=2;
        System.out.println(sy);
        sy*=5;
        System.out.println(sy);
        sy/=2;
        System.out.println(sy);
        sy+=20;
        System.out.println(sy);
        sy%=10;
        System.out.println(sy);

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı gir");
        double a= scan.nextDouble();
        double b = a;
        a*=2;
        a+=10;
        a/=2;
        a=a-b;
        System.out.println("sonuç = " + a);

        Scanner scan =new Scanner(System.in);
        System.out.println("ilk sayi");
        int a=scan.nextInt();
        System.out.println("ikinci sayi");
        int b=scan.nextInt();
        boolean c=(a==b);
        System.out.println("sounç "+c);

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
        System.out.println("Çıkan sonucu bir azaltın");
        aSayi=aSayi-=1;
        System.out.println("SONUÇ "+aSayi);
        //ÖDEV 2
        //Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın.
        // Araba fiyatı üzerinden KDV miktarını
        //hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı)
        // üzerinden ÖTV oranındaki artışı
        //toplam tutara ekleyerek hesaplayın. Çıkan sonuç
        // 700.000 ve üzeri ile 1.000.000 (bir milyon)
        //arasında ise ekrana true yazdırın;

        Scanner scan=new Scanner(System.in);
        System.out.println("Araç fiyatını girin");
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
        System.out.println("Lütfen adınızı yazın");
        String ad =scan.nextLine();
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
