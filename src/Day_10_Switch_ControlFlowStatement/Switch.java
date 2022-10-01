package Day_10_Switch_ControlFlowStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kacıncı ay");
        int numOfMonth = sc.nextInt();


        switch (numOfMonth) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;


        }
        System.out.println("kacıncı gün");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("p.tesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çar");
                break;
            case 4:
                System.out.println("per");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("c.tesi");
                break;
            case 7:
                System.out.println("pazar");
                break;


        }


        System.out.println("beden gir");
        int bdn = sc.nextInt();
        switch (bdn) {

            case 38:
                System.out.println("small");
                break;
            case 40:
                System.out.println("small");
                break;
            case 42:
                System.out.println("small");
                break;
            case 44:
                System.out.println("medium");
                break;
            case 46:
                System.out.println("medium");
                break;
            case 48:
                System.out.println("medium");
                break;
            case 50:
                System.out.println("large");
                break;
            case 52:
                System.out.println("large");
                break;
            default:

        }


        System.out.println("iki sayıgir");
        int sy1 = sc.nextInt();
        int sy2 = sc.nextInt();
        System.out.println("işlem ne");
        sc.nextLine();
        String islem = sc.nextLine();
        int sonuc = 0;
        switch (islem) {
            case "+":
                System.out.println(sy1 + sy2);
                break;
            case "-":
                System.out.println(sy1 - sy2);
                break;
            case "*":
                System.out.println(sy1 * sy2);
                break;
            case "/":
                System.out.println(sy1 / sy2);
                break;
            default:


        }


//        3 katlı bir motel in
//        1. katında Resepsion, Güvenlik ve Oda hizmetler var.
//        2 katında Yemekhane, Dinlenme salonu ve Room1,Room2
//        3.katında ise Room3,Room4,Room5,Room6 vardır.
//        Bir switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım alacagınız bir program(nested
//        switch) yazın. Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.
//
//        message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.
//        message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
//        2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
//        3.kat : Room3-Room4-Room5-Room6
//        Resepsion : tüm işlemleriniz için bekleriz
//        Güvenlik : profosyonel bir hizmettir
//        Oda hizmetleri : temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz
//        Yemekhane : Kahvaltı 08-11
//        Öğle yemeği 12-15
//        Akşam yemeği 18-21
//        Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
//        Room1,Room2 : ekonomik oda
//        Room3,Room4 : standart oda
//        Room5,Room6 : özel oda


        System.out.println("lütfen  1-2-3 bir kat no girin ve oda adı seçin.");
        System.out.println("\n1.kat : Resepsion-Güvenlik-Oda hizmetleri\n"+
                     "2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n"+
                      "3.kat : Room3-Room4-Room5-Room6");
        int kat = sc.nextInt();
        sc.nextLine();
        String room = sc.nextLine();
        switch (kat) {
            case 1:
                switch (room){
                    case "Resepsion":
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    case "Güvenlik":
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                }

                break;
            case 2:
                switch (room) {
                    case "Yemekhane":
                        System.out.println("Kahvaltı 08-11\n" +
                                "        Öğle yemeği 12-15\n" +
                                "       Akşam yemeği 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1":
                        System.out.println("ekonomik oda");
                        break;
                    case "Room2":
                        System.out.println("ekonomik oda");
                        break;

                }
                break;
            case 3:
                switch(room){
                    case "Room3":
                        System.out.println("standart oda");
                        break;
                    case "Room4":
                        System.out.println("standart oda");
                        break;
                    case "Room5":
                        System.out.println("özel oda");
                        break;
                    case "Room6":
                        System.out.println("özel oda");
                        break;
                }
                break;
            default:
                System.out.println("otel 3 katlıdır");


        }


    }
}
