package W_3_D_1_ForLoops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


       /* for (int i = 0; i < 10; ++i) {
            System.out.println(i + " talip");

        }
        for (int a = 1; a <= 20; a++) {
            System.out.println(a + " merhaba dünya");

        }

        for (int i = 0; i < 100; i += 2) {
            if (i % 2 == 0) {
                System.out.print(i+" ");

            }
        }

        for (int i = 10; i < 1000; i += 10) {
            System.out.println( i+" ");
        }
        int sonuc=1;
        for(int i=6;i>0; i--){
            sonuc*=i;

        }System.out.println("6! ="+sonuc);

        int j;
        for(int i=0;i<20;i++){
         j=i*i*i;


            System.out.println(j);



        Scanner scan=new Scanner(System.in);
        System.out.println("kelime yaz");
        String kelime= scan.nextLine();
        System.out.println("kaç defa yazsın");
        int tekrar= scan.nextInt();
        for(int i=0;i<tekrar;i++){
            System.out.println(kelime);
        }
        System.out.println("0- 1000 arası sayı gir");
        int sayi= scan.nextInt();
        int sonuc1=0;
        for(int i=0;i<=sayi;i++){
            sonuc1+=i;

        }
        System.out.println(sonuc1);


        System.out.println("0- 1000 arası sayı gir");
        int sayi1= scan.nextInt();
        int tekSayi=0;
        int ciftSayi=0;
        for(int i=0;i<=sayi1;i++){

            if(i%2==0){
                ciftSayi+=i;

            }
            else {
                tekSayi+=i;
            }


            System.out.println(tekSayi);

        int i=1;
        for(;i<5;i++){
            System.out.println("tt" );

        }

        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");

        }
        for(int i=1;i<10;i++){
            System.out.println("9*"+i+"="+(i*9));

        }*/
        String kelime="talip";
        for(int i=0;i<3;i++){
            System.out.println("kelime gir");
            String kullaniciKelime= scan.nextLine();
            if(kullaniciKelime.equals(kelime)){
                System.out.println("buldun");
                break;
            }




        }















}














    }
