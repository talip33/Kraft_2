package W_3_D_4_Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
       // aritmetik();
        //odev2();
        //okkaKg();
        //short s=5;
        //message4((int)5.5);
        message5("salı",5);

    }

    public static void aritmetik() {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sonuc = (a + b + c) / 3;
        System.out.println("ortalama " + sonuc);

    }

    public static void odev2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı gir");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sonuc=a > b ? a : b;

            System.out.println(sonuc);
        }

        public static void okkaKg(){
        Scanner scan=new Scanner(System.in);
            System.out.println("Kg gir");
        double kg= scan.nextInt();

            System.out.println(kg/1.282);

        }

        public static void message4(int num){
            System.out.println(num+ " burada ");
            System.out.println(num+3);
        }
        public static void message5(String str,int i){
        System.out.println( str +" "+ i);

        }

    }


