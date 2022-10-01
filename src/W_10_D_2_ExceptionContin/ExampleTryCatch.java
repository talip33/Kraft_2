package W_10_D_2_ExceptionContin;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {

        //integer değişken kabul eden bi metot yaz
//    kullanıcıdan tek bir sağlayın
//    kulanıcı int dışın da değer girerse hata mesjı
//   doğru giriş yapana kadar veri al


      /*  boolean devam=true;
        while(devam){
            try {
                Scanner sc = new Scanner(System.in);
                int dnm = sc.nextInt();
            }catch (Exception e){
                System.out.println("tekrar dene");
                continue;
            }
            System.out.println("proramdan cık");
            devam=false;

        // iki sayı al 1.sayı 2.sayıya böl
       // kalanı ekrana yazdır.2adet catch blok


      boolean devam1=true;
       while(devam1){
       try{
           Scanner sc = new Scanner(System.in);
           System.out.println("1.sayi gir");int x = sc.nextInt();
           System.out.println("2.sayi gir");int y = sc.nextInt();
           System.out.println(x/y);

       }catch (ArithmeticException a){
           System.out.println("aritmetic hata tekrar dene");
           //e.getMessage()
           continue;
       }catch (Exception e){
           System.out.println("hata alındı");
           continue;
       }
       finally {
           System.out.println("finally blk");

       }
        }devam1=false;

        }*/
        //personel işlerini tutan bir array tanımlayın
        //   ve içerise 5 adet int türnde id gönderin ---arr[]={}--
        //  bu idlerin içerisinde 0 var ise IllegalArgumentException hatası döndürün
        //  bunu bir checkArrayId metot içerisinde  yazın



int arr[]={1,23,55,0};
        System.out.println(checkArrayId(arr));

    }
public static boolean checkArrayId(int[]arr){
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0){
            throw new IllegalArgumentException("ıd 0 olmaz");

        }
    }
return true;
}

    //array içeisinde en büyük sayıyı getiren metodu yazınız
    //eger en büyük sayıdan 2 veya fazla ise new exception throw edin

public static int buyukSayi (int[]array) throws Exception {
     int arr[]=array;
     int indexNumber=0;

   Arrays.sort(arr);
   int x=arr[arr.length-1];
   if(arr[arr.length-2]==x){
       throw new Exception("büyük sayı 2 tane");
   }
    for (int i = 0; i < array.length; i++) {
        if(array[i]==x){
            indexNumber=i;
        }

    }

return indexNumber;
}



        }



