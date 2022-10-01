package W_5_D_1_StringExample;

import java.util.Scanner;

public class String_Example {
    public static void main(String[] args) {
        //System.out.println(firstThree("abcd"));
        //System.out.println(bslukKaldır("marhabe talip tıras"));
        //System.out.println(ikinciYari("hatmer"));
        //System.out.println(changeWord("Merhaba", "a", "i"));
        //System.out.println(ucKez("talip"));
        // System.out.println(kacAdet("ankara","a"));
        // System.out.println(kelimeSayisi("ankaraankaran", "an"));
        // System.out.println(harfSil("hahaahh", "a"));
        //System.out.println(kincntrol("merhaba", "rha"));
        //ikiTekrar("talip","tıraş");
        //besNokta("kız");
        //System.out.println(ikiHarf("aakammmmmkaa"));
        //System.out.println(soyAd("ahmer hakan"));
        //System.out.println(rakamBul("aaa00988fffgg77"));
        //System.out.println(harfBul("aaa00988fffgg77"));
        // System.out.println(unluler("ahmet maehmet talip tıraş yakup"));
        //System.out.println(ucHarfSona("abcdefghijk"));
        //System.out.println(ucHarfBasa("abcdefghijk"));
        //System.out.println(benzersiz("aaaeba"));
        //System.out.println(ayniHarf("talip", "pilat"));
        //System.out.println(ardiArdina("aaabbbcddd"));
       // System.out.println(yinelenenHarf("aaabbbcddd"));
       // System.out.println(ucGiris());
        System.out.println(tersOku("kankai"));
       // System.out.println(sev("sevgi","sev"));
       // System.out.println(besNokta(""));
        //System.out.println(cikar("hasan"));
    }

    //    Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
//    3 harften az ise inputu döndüren bir metot yazınız.
    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;
        }

        return str.substring(0, 3);


    }

    //    Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin
    public static String bslukKaldır(String str) {

        return str.replace(" ", "%");
    }

    //    Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
//    yazdırın.
    public static String ikinciYari(String str) {

        return str.substring(str.length() / 2);
    }

    //    Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
//    yeni harfi/harfleri
//    alan ve buna göre kelimede/dizede sadece ilk bulduğu
//    yeri değiştiren metodu
//    yazınız.
    public static String changeWord(String str, String old, String new1) {

        return str.replaceFirst(old, new1);
    }

    //    Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    public static String ucKez(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < 3; j++) {
                result = result + str.charAt(i);

            }

        }
        return result;

    }

    //    Kullanıcıdan bir kelime ve bir karakter alın ve bu
//    kelimenin istenen karakterin
//    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf
//    göz ardı
//    edilecek)
    public static int kacAdet(String str, String target) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(target)) {
                count++;
            }

        }
        return count;
    }
//    Kullanıcıdan bir kelime ve bir hece alın ve bu
////    kelimenin istenen karakterin
////    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf
////    göz ardı
////    edilecek)

    public static int kelimeSayisi(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length() - (target.length() - 1); i++) {
            if (str.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                count++;
            }

        }
        return count;
    }
//    Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
//    kaldırılmış şekilde string döndüren programı yazınız.

    public static String harfSil(String kelime, String harf) {

        return kelime.replace(harf, "");
    }

    //    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
//    ilk karakterden sonra
//    gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa
//    false döndürün;
    public static boolean kincntrol(String kelime, String cotrol) {
        if (kelime.substring(0, cotrol.length()).equalsIgnoreCase(cotrol) ||
                kelime.substring(1, 1 + cotrol.length()).equalsIgnoreCase(cotrol)) {
            return true;
        }
        return false;

    }

    //    Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi
//    ortada 30
//    defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    public static String ikiTekrar(String a, String b) {
        String result = "";


        for (int i = 0; i < 2; i++) {
            result += a;
        }
        for (int j = 0; j < 30; j++) {
            result += b;
        }
        for (int i = 0; i < 2; i++) {
            result += a;
        }

        return result;
    }
//    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
//    5 karakterin
//    altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
   public static String besNokta(String str){

        String result="";
        String result2="";
        if (str.length()>=5) {
            return str.substring(0,5);
        } else if (str.length()<5) {

            for (int i = 0; i < 5-str.length(); i++) {
               result2=str.concat(result+=".");
            }
        }
       return result2;
    }
//    Kullanıcıdan bir kelime alın ve bu kelimenin
//    ilk 2 harfi sonunda yer alıyorsa true
//    almıyorsa false yazdırın.

    public static boolean ikiHarf(String str) {
        // str.substring(str.length()-3,str.length()-1).equals(str.substring(0,2));

        if (str.substring(str.length() - 2).equalsIgnoreCase(str.substring(0, 2))) {
            return true;
        }
        return false;
    }

    //    Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//    Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
    public static String soyAd(String str) {
        String str1 = str.trim();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                count = i;
            }
        }
        if (count == 0) {

        }
        return str1.substring(count + 1);

        // return str1.substring(str1.lastIndexOf(" ")+1);
    }
//    Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
//    çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)

    public static String cikar(String str) {

        String result = "";
        String result2 = "";
        int sum=0;
    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < str.length(); j++) {
            result2+=str.charAt(j);
            sum++;
            if(sum>=2){str.replace(result2,"");        }
        }

    }
        return result;
    }


//    Kullanıcıdan bir kelime alan ve sonucunda
//    yinelenen kelimeleri
//    string    olarak return eden methot yazınız

    public static String yinelenenHarf(String str) {
        str = str.replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                result += str.substring(0, 1);

            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;

    }

    //    yazılan kelimeni içerisinde sayıları yazdıran metodu yazınız
    public static String rakamBul(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 47 && str.charAt(i) > 58) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    //    yazılan kelimeni içerisinde harfleri yazdıran metodu yazınız
    public static String harfBul(String str) {
        String result = "";
        String abc = "abcdefghijklmnoprstuvyz";


        for (int i = 0; i < abc.length(); i++) {

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == abc.charAt(i)) {

                    result += str.charAt(j);
                }
            }


        }
        return result;
    }

    // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve
//    ünsüz harfleri ayrı ayrı ekrana yazan programı yazınız
    public static String unluler(String str) {

        String result2 = "";
        String result = "";
        String unsuz = "bcdfghjklmnprstvyz";
        String unlu = "aeıioöuü";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < unlu.length(); j++) {
                if (unlu.charAt(j) == str.charAt(i)) {
                    result += str.charAt(i);
                }

            }
            for (int m = 0; m < unsuz.length(); m++) {
                if (unsuz.charAt(m) == str.charAt(i)) {
                    result2 += str.charAt(i);
                }
            }
        }
        return result2 + result;
    }

    //    Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve
//    bu kelimenin ilk 3 harfini kelimeden keserek sonuna ekleyin
    public static String ucHarfSona(String str) {
        String result = "";
        if (str.length() >= 3) {
            result = str.substring(3).concat(str.substring(0, 3));

        }
        return result;
    }

    //    Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu
//    kelimenin son 3 harfini kelimeden keserek kelimenin başına ekleyin.
    public static String ucHarfBasa(String str) {
        String result = "";
        if (str.length() >= 3) {
            result = str.substring(str.length() - 3).concat(str.substring(0, str.length() - 3));

        }
        return result;
    }
//    Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
//    (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise
//    benzersiz harf yoktur ikazı versin.

    public static String benzersiz(String str) {
        int cont = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            cont++;

            if (cont <= 1) {
                result += str.charAt(i);
            } else if (cont > 1) {
                System.out.println("benzersiz yok");

            }

        }
        return result;
    }
// Kullanıcıdan iki kelime alın ve bu kelimeler
// aynı harflerden oluşuyorsa(her harf
//eşit sayıda içerecek,büyük küçük harf göz ardı
// edilecek) true oluşmuyorsa false
// yazdırın. (anagram kelime ise)

    public static String ayniHarf(String a, String b) {
        String result = "";

        for (int i = 0; i <= a.length(); i++) {

            for (int j = 0; j < b.length(); j++) {

                if(a.charAt(i)==b.charAt(j)){
           result+=a.charAt(i);
                }

            }


        }

return result;
    }
    public static String ardiArdina(String str){
         String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                result+=str.charAt(i);

            }

        }

      return result;
    }
//    Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
//    girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
//    Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
//    giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
//    birleştirerek yazdırın

    public static String ucGiris(){
       Scanner scan=new Scanner(System.in);
       String str1= scan.nextLine();
       String str2= scan.nextLine();
        int tekrar=1;
        String a="ali";
        String b="veli";
       String result="";
        do {
            if (a.equalsIgnoreCase(str1) && b.equalsIgnoreCase(str2)) {
          result=a.concat(b);
          break;

            } tekrar++;


//       for (int i = 0; i < 3; i++) {
//        tekrar++;
////       if (a.equalsIgnoreCase(str1) && b.equalsIgnoreCase(str2)){
//           result=a.concat(b);
//           break;}
//
//

        }while (tekrar < 4);
        System.out.println("tekrar dene");



return result;
    }









//    24 --Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu
//    kelime ile aynı ise
//     true değil ise false döndüren metot yazınız.

    public static boolean tersOku(String str){
        for (int i = 0,j=str.length()-1; i < str.length(); i++,j--) {

           // for (int j = str.length()-1; j <str.length(); j--) {

                if (str.charAt(i)==str.charAt(j)) {
                    return true ;
       // }

        }

    }return false;

}



//   25-- Kullanıcıdan bir input alın ve bu inputun içerisinde
//    kaç adet sev bulunduğunu
//    ekrana yazdırın.

    public static int sev(String str,String aranacakKlm){

        int sayi=0;

            if(str.contains(aranacakKlm)){

                for (int i = 0; i < str.length(); i++) {
                str.replace(aranacakKlm,"deli"  );
                sayi++;
            }
            }

        return  sayi;

}

//    26--Bursa ile Ankara kelimeleri cümlenin içerinde aynı
//    sayıda dönüyorsa true farklı
//    sayılarda dönüyorsa false yazdıran metodu yazınız.
//    Ankara ile Bursa arası 500 km. True
//    Ankara Bursa kadar yeşil değil. Bursa bir başka. False
//    İstanbul çok uzak false



//    27--Kullanıcıdan bir kelime alın ve sonu acak ile
//    bitiyorsa true bitmiyorsa false
//    döndüren metodu yazdırın.



//    28--Kullanıcıdan bir kelime alın ve bu kelimenin
//    içerindeki harf sayılarını başına
//    yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
//    Merhaba 1m1e1r1h2a1b
//    Seni seviyorum 2s2e1n2i1v1y1o1r1u1m


//    29--Kullanıcıdan bir dize sözcük alın ve en çok
//    harfi döndüren metodu yazınız.
//    Merhaba a
//    aaaaaaabbcccc a
//    eeemmmsssssssssshhhhhhhhhsss s





}







