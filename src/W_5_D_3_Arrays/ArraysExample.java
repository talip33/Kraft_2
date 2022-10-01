package W_5_D_3_Arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {



        String[] str=new String[5];
        str[1]="tt";

        int [] a=new int[4];
        a[0]=5;
        a[1]=2;
        a[2]=45;
        a[3]=1;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]*a[i]);//mat.pow()
        }
        String[] gunler=new String[7];
        gunler[0]="p.tesi";
        gunler[1]="salı";
        gunler[2]="çarsamba";
        gunler[3]="per";
        gunler[4]="cuma";
        gunler[5]="c.tesi";
        gunler[6]="pazar";
       // System.out.println("bugün günlerden "+gunler[2]);
        if(gunler[2].equalsIgnoreCase("çarsamba")){
            System.out.println("haftanın 3.günü çarsamba");
                    }
        else {
            System.out.println("3.gün çarsamba değil");
        }

        int count=0;
        for (int i = 0; i < 7; i++) {
            if(gunler[i].equalsIgnoreCase("cuma")){

                count++;

            }
        }
                if(count>0){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }




        String[] ad={"talip","ayse","ali"};
        //int count=0;
        for (int i = 0; i < 3; i++) {
            if(ad[i].equalsIgnoreCase("talip")){
                count++;

            }

        }
        if(count>0){
            System.out.println("ad var");

        }else{
            System.out.println("yoktur");
        }

        Random random=new Random();
        int [] sayi=new int[20];
        int tek=0,cift=0;
        for (int i = 0; i < 20; i++) {
            sayi[i]= random.nextInt(100);
           System.out.println((i)+"sayi "+sayi[i]);
            if(sayi[i]%2==0){
                //System.out.println(sayi[i]+" ");
                 cift++;
            }else {tek++;}
        }
        System.out.println("tek "+tek+" cift "+cift);



    }









}
