package W_3_D_4_Methods;

import java.util.Scanner;

public class Methods_2 {
    public static void main(String[] args) {
       // yas(1980);
       // usthesap(2,3);
       // usthesap(2,2);
       // mat(3,6);
       // ayni();
        //asal();
       // positiv();
        dersNotu();

    }
    public static void yas(int dogum){
        System.out.println(2022-dogum);

    }
    public static void usthesap(int a,int b){
        double pow= Math.pow(a,b);
        System.out.println((int)pow);

    }
    public static void mat(int a,int b){
        System.out.println("sonuc "+(a+b));
    }

    public static void islem(int a,int b,String str ) {
        if(str.equals("+")){
            System.out.println(a+b);
        }else if(str.equals("-")){
            System.out.println(a-b);
        }else if(str.equals("/")){
            System.out.println(a/b);
        }else if(str.equals("*")){
            System.out.println(a*b);
        }else{
            System.out.println("yanliş");
        }


    }

   public static int sum(int a,int b) {
        return a+b;

    }
    public static void ayni(){
        Scanner scan=new Scanner(System.in);
        System.out.println("2 sayı gir");
        int a= scan.nextInt();
        int b= scan.nextInt();

        if((a%10)==(b%10)){
            boolean c=true;
            System.out.println(c);
        }else{
            boolean c =false;
            System.out.println(c);
        }

    }
    public static void asal(){
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");
        int asal= scan.nextInt();
        if((asal==2) || (asal/asal==1)){
            boolean a= true;
System.out.println(  " sayi "+ asal+" asal");
        }else {
            boolean a=false;
            System.out.println("asal değil");
        }

    }
    public static void positiv(){
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi= scan.nextInt();
        if(sayi== +sayi){
           int a= -sayi;
           System.out.println(a);
        }
        else{
            int a= +sayi;
            System.out.println(a);

        }

    }

    public static void dersNotu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("3 not gir");
        int not1=scan.nextInt();
        int not2=scan.nextInt();
        int not3=scan.nextInt();
        int ort=(not1+not2+not3)/3;



        if(ort>=76 || ort<=100){
            char a='A';
            System.out.println("Ortalama " +ort +a);

        }
        else if(ort>=51 || ort<=75){
            char b='B';
            System.out.println("Ortalama "+ ort+ b);


        }
        else if (ort>=0 || ort<=50){
            char c='C';
            System.out.println("Ortalama " + ort +c);
        }


    }







}
