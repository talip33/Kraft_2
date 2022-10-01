package W_4_D_2_Class_Object;

import java.util.Random;
import java.util.Scanner;

public class Banka {
    int hesapNo;
    String musteriAdSoyad;
    double paraMiktari;
    boolean mobilBankacilik;


    public void hesapAc(){
        Scanner scan=new Scanner(System.in);
        System.out.println("isim: ");
        musteriAdSoyad=scan.nextLine();
        Random random=new Random();
        hesapNo= random.nextInt(1000000);
        System.out.println("Sayın "+musteriAdSoyad+" "+hesapNo+
                " nolu hesabınız açıldı");
    }

 public void mobilBankacilik(){
     Scanner scan=new Scanner(System.in);
     System.out.println("Mobil bankacılık kullanmak için lütfen" +
             "evet yazınız: ");
    String onay=scan.nextLine();
    if(onay.equals("evet")||onay.equals("Evet")||onay.equals("EVET")){
        mobilBankacilik=true;
        System.out.println("Sayın "+musteriAdSoyad+ " Mobil bankacılığa hoşgeldin");
    }else{
        System.out.println("Sayın "+musteriAdSoyad+" mobil bankacılığa giriş yapamazsınız");
    }
 }

public void paraYatir(double para){
    paraMiktari+=para;
}
public void hesapOzeti(){
    System.out.println(musteriAdSoyad+" "+hesapNo+" nolu heabınızda "+paraMiktari+
            " dolar vardır");
}


}
