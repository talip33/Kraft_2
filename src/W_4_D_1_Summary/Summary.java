package W_4_D_1_Summary;

public class Summary {
    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayi = scan.nextInt();
        System.out.println("basamak sayısı " + basamakSayisi(sayi));
        basamakSayisi(sayi);
        System.out.println(mathPow(3, 3));
        armstrongTree(122,999);
        fibonacci(11);*/

        System.out.println("ebob(11,121) = " + ebob(11, 121));
    }
       public static int basamakSayisi(int sayi) {
           int basamak=0;
           while(sayi>0){
              sayi/=10;
              basamak++;



           }
           return basamak;
       }


//        Kullanıcı dan 2 sayı alın. İlk sayı taban, ikinci sayı ise üs olsun mathPow metodu oluşturun işlemler bu metodun
//        içerisinde yapılsın. (Math sınıfının pow metodunu siz yapacaksınız)
//        Math.pow(2,3)=8
//        mathPow(2,3)=8

        public static int mathPow(int taban,int ust) {
            int sonuc = 1;
            for (int i = 0; i < ust; i++) {
                sonuc*=taban;

            }
            return sonuc;
        }

//       100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın. Sayının her basamağının
//        küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak adlandırılır.

//142 1*1*1 + 4*4*4+ 2*2*2/*

        public static void armstrongTree(int start,int end){
            for(int i=start;i<=end;i++){
                int x,y,z,sonuc;
                x=i/100;
                y=i%100/10;
                z=i%10;
                sonuc=x*x*x+y*y*y+z*z*z;
                if(i==sonuc){
                    System.out.println(sonuc);
                }


            }

        }

//    Kullanıcı tarafından girilen n terimli
//    Fibonacci dizisini yazdıran
//    bir program yazın: 0 1 1 2 3 5 8 13 24

        public static void fibonacci(int adet){
    int x=0,y=1;
    System.out.print(x+" "+y);
    for(int i=2;i<adet;i++){

        int z=x+y;
        System.out.print(" "+y);
        x=y;
        y=z;
    }
}

//    Kullanıcıdan 2 sayı alın ve bu iki sayının
//    en büyük ortak bölenini ekrana yazdırı. 1 ile 7 sonuc 1 6-12(6)
    public static int ebob(int x,int y){
        int sonuc=1;
        for(int i=1;i<=Math.max(x,y);i++){
            if(x%i==0 && y%i==0){
                sonuc=i;
            }
        }

        return sonuc;

    }

    }


