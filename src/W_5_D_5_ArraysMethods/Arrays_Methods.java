package W_5_D_5_ArraysMethods;

import java.util.Arrays;

public class Arrays_Methods {

    public static void main(String[] args) {


//////////////////////////////////////////
        String str4="merhaba java insanları bugün nasılsınız";
        String str2="kayısı, armut, üzüm, çilek, nar";
        int[] sayiler={11,22,3,4,5,6,7,28,9};
        String str="merhaba java insanları";
        String[] arry=str.split(" ");
        arry[1]="yurdum";


       // System.out.println(arry[0]);
       // System.out.println(arry[1]);
       // System.out.println(Arrays.toString(arry));
       // System.out.println(Arrays.toString(stringToArray4(str4)));
       // System.out.println(Arrays.toString(nBoy(10)));
        //System.out.println(aritm(sayiler));
        //System.out.println(Arrays.toString(elem(sayiler)));
        System.out.println(Arrays.toString(elem2(sayiler)));
//////////////////////////////////////////
        int[] arrys={1,2,3,4,5,6,7,8,9};
       int[] cc= Arrays.copyOfRange(arrys,2,6);
       // System.out.println(Arrays.toString(cc));
    /////////////////////////////////////////////////
        int[] arrys2={11,22,3,4,5,6,7,28,9};
        Arrays.sort(arrys2);
       // System.out.println(Arrays.toString(arrys2));
//////////////////////////////////////////////////////
        Arrays.fill(arrys2,2,5,10);
        //System.out.println(Arrays.toString(arrys2));
        Arrays.fill(arrys2,10);
       // System.out.println(Arrays.toString(arrys2));

//«merhaba java insanları bugün nasılsınız» gibi bir cümleyi
// her kelime bir
//  element olacak şekilde bir array a dönüştüren
// bir method yazın.



    }

    public  static String[] stringToArray(String str){return str.split(" ");}


//    kayısı, armut, üzüm, çilek, nar» cümlesinde ki
//    meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın.
//    Elementlerden 5 den az harfi olan
//    varsa onun yerine armut atayın

    public  static  String[] stringToArray2(String str){
        String[] split= str.split(",");
        for (int i = 0; i < split.length; i++) {
            if(split[i].length()<5){
                split[i]="armut";
            }

        }


        return split;
    }

//elma, armut, üzüm, çilek, nar» cümlesinde ki
// meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın.
//    İlk ve son idexi swaping yapın.

public  static  String[] stringToArray3(String str){
        String[] split=str.split(",");

        String temp=split[0];
        split[0]=split[split.length-1];
        split[split.length-1]=temp;
return split;
}

//«merhaba java insanları bugün nasılsınız» gibi
//    bir cümlenin ikinci kelimesinin
//    harflerinden bir döndüren method yazın.
public  static  String[] stringToArray4(String str){
        String[] arr=str.split(" ");
        return arr[1].split("");

}
//    Bir method yazın int n parametre olarak alsın.
//    n değeri kadar sayıları sıralı bir
//    biçimde bir array içine yerleştirsin. n = 5  Exm: [0,1,2,3,4]

public  static  int[] nBoy(int n){

        int[] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=i;


    }
       return arr;
}

//   karmaşık Bir sayı dizisinin en büyük ve en küçük degrli
//    element lerinin
//    aritmetik ortalamasını
//    veren bir method yazın

    public  static  int aritm (int[] arr){
        Arrays.sort(arr);
        return (arr[0]+arr[arr.length-1])/2;

    }
//    Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini
//    onunla dolduran bir
//    method yazın
public  static  int[] elem (int[] arr){
        Arrays.sort(arr);
        Arrays.fill(arr,arr[0]);
        return arr;

}
//    Bir sayı dizisinin en küçük harfi ne ise sayı
//    dizisini (en büyük değer hariç)
//    onunla dolduran bir method yazın.

    public  static  int[] elem2 (int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, 0,arr.length-1,arr[0]);
        return arr;


    }

}
