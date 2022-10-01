package W_3_D_2_While_NestedLoop;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

       /* int i=0;
        while(i<5){//for(int i=0;i<5;i++)
            System.out.println("talip");
            i++;
        }


        int i=0;
        while(i<10) {
            System.out.println("merhaba sınıf");
            i++;
        }
        int i=0;
        while(i<100){
            System.out.print(i+" ");
            i++;
        }
        int i=100;
        while(i>0){
            System.out.print(i+" ");
            i--;
        }
        int i=0;
        while(i<100){
            System.out.print(i+" ");
            i+=2;
        }
        int i=1;
        while(i<100){
            System.out.print(i+" ");

            i+=2;
        }
        int i=10;
        while(i<1000){
            System.out.print(i+" ");
            i+=10;

        }
        int i=1;
        int faktor =1;
        while(i<=8){
            faktor*=i;
            i++;
            System.out.print(faktor);



        }
        int i=3;

        while(i<20){
            int sonuc=i*i*i;
            System.out.println(i+" "+sonuc);
            i+=3;

        }
        Scanner scan=new Scanner(System.in);
        String exit="x";
        while(true){
            System.out.println("kelime gir");
            String kelime= scan.next();
            if(kelime.equals("x")){
                break;
            }
            System.out.println("kaç defa");
            int repeat= scan.nextInt();
            for(int i=0;i<repeat;i++){
                System.out.println(kelime);

            }
        }
        //f=(c*1.8)+32
        double f=23;
        double c;
        while(f<50){
             c=((f-32)/1.8);
             f++;
            System.out.println(f+" F "+c+" C  ");

        }*/
        Scanner scan=new Scanner(System.in);
        System.out.println("0-1000 arası sayı gir");
        int sayi= scan.nextInt();
        int sonuc=0;

            for (int i = 1; i <= sayi; ++i) {
                sonuc += i;

                System.out.println(sonuc);


            }




        }















    }

