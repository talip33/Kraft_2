package W_6_D_2_Array_Example_2;

import W_6_D_1_Array.ArrrayExample_1;

import java.util.Arrays;
import java.util.Random;

public class Array_Example_2 {



    public static int rasgeleArrayKontrol(int boyut,int kontrolSayi) {
        Random random = new Random();
        int[] yeniArray = new int[boyut];
        int count = 0;
        for (int i = 0; i < boyut; i++) {
            yeniArray[i] = random.nextInt(20) + 120;
            if (yeniArray[i] == kontrolSayi) {
                count++;
            }
        }
        return count;


    }

//    Array içerisindeki en büyük 2. sayıyı bulun.
//            (Array.sort kullanılmayacak)

public static int enBuyukIkinciSayi(int[] arr){
      int a=arr[0];
      int b=arr[0];
      int c=arr[0];
        for (int sayi : arr) {
        if(sayi>a){   a=sayi;
        }
    }
        for (int sayi:arr){
            if(sayi>b && sayi<a){ b=sayi;}
        }
    for (int sayi:arr ) {
        if(sayi>c && sayi<b){c=sayi;}

    }
return c;




}
//    Array’in içerisinde ard arda 3 adet sıralı
//    sayı var ise true döndüren metodu yazınız.
public static boolean artardaUcSayi(int[] arr){
       int a=arr[0];

    for (int i = 0; i < arr.length-2; i++) {
        if (arr.length < 3) {return false; }
         if (arr[i]==arr[i+1]-1 && arr[i]==arr[i+2]-2) {

             return true;
        }


    }


return false;
}
//    Array’in içerindeki eşi olmayan yalnız sayıları bulan
//    ve bunları ekrana yazdıran metoduyazınız.
//     (sağında veya solunda aynı sayı yoksa yalnızdır.)return array


    public static String[] esiYok (int []arr){

        String esiYokkk="";
        if(arr.length==1){
            esiYokkk+=arr[0]+" ";
            return esiYokkk.split(" ");
        }
        if(arr[0]!=arr[1])esiYokkk+=arr[0]+" ";

            for (int i = 1; i < arr.length-1; i++) {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                    esiYokkk += arr[i] + " ";
            }

                if(arr[arr.length-1]!=arr[arr.length-2]){
                    esiYokkk+=arr[arr.length-1]+" ";
                    return esiYokkk.split(" ");
                }







return esiYokkk.split(" ");
    }
    public static void main(String[] args) {
        String s = "Bir fil ";
        int []sayilar={1,1,1,2,3,6,6,7,8};
        //System.out.println(enBuyukIkinciSayi(sayilar));
        //System.out.println(artardaUcSayi(sayilar));
        // ArrrayExample_1.arrayYazdir(esiYok(sayilar));
        System.out.println(enCokSayi(sayilar));

    }

//   Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
//   (eşitlik durumda herhangi birini alabilir,1 den fazla
//    bulunmuyorsa -1 döndürecek)

public static int enCokSayi(int[] arr){
       int enCok=arr[0];
       int count=0;
       int adet=0;
       for(int i=0;i<arr.length;i++){
            count=0;
           for (int j = 0; j < arr.length; j++) {
               if(arr[i]==arr[j]){
                   count++;
               }

           }
           if(count>adet){
               enCok=arr[i];
               adet=count;
           }

       }
return enCok;
}
//    Array’in içerindeki dublicate sayı varsa true
//    yoksa false döndüren metodu yazınız.
public static boolean dublicateControl(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (i!=j && arr[i]==arr[j]){
                return true;
            }

        }

    }
return false;

}

}