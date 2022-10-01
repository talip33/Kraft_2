package Day_9_If;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        int hız = 10;
        boolean isMoving = true;
        if (isMoving) {
            hız++;
            System.out.println("hız= " + hız);

            int x = 10;
            int y = 0;
            if (x == 10) {
                y = 20;
                System.out.println("y =" + y);
                System.out.println("------------------------");


                Scanner scan = new Scanner(System.in);
                int yaz = 10;
                if (yaz >= 20) {
                    System.out.println("kelebekler uçar");

                } else {
                    System.out.println("kelebekler sogukta pek uçmazlar");
                    System.out.println("------------------------");

                }
                int aysePara = 4;
                if (aysePara < 5) {
                    aysePara = aysePara + 10;
                    System.out.println(aysePara);
                    System.out.println("------------------------");
                } else {
                    System.out.println("Ayşe paran yeter kızım ");
//
//            double blance= 2050;
//            double priceOfSuit=2000;
//
//            if(blance>=priceOfSuit){
//                System.out.println("takımı alabilir");
//
//
//            }else{
//                System.out.println("yetersiz bakiye");
                }
                Scanner sc = new Scanner(System.in);
//                System.out.println("sayıları gir");
//                int a;
//                int b;
//                a = scan.nextInt();
//                b = scan.nextInt();
//
//                if (a > b) {
//                    System.out.println("ilk sayı büyük");
//
//                } else if (b > a) {
//                    System.out.println("ikinci sayı büyük");
//
//
//                } else {
//                    System.out.println("sayılar eşit");
//                }
//
//                System.out.println("------------------------");
//
//            }
//            Scanner sc = new Scanner(System.in);
//
//            int a1;
//            int b1;
//            int c1;
//            System.out.println("sayı gir");
//            a1 = sc.nextInt();
//            b1 = sc.nextInt();
//            c1 = sc.nextInt();
//
//            if (a1 + b1 > c1) {
//                c1 = a1 - b1;
//                System.out.println("c1 =" + c1);
//
//            }
//
//            int a = 5;
//            if (a % 2 == 0) {
//                System.out.println("sayı çift");
//            } else {
//                System.out.println(" sayi tek");
//
//            }
//            int aci1 = 90;
//            int aci2 = 45;
//            int aci3 = 45;
//            if (aci3 + aci1 + aci2 == 180) {
//                if (aci2 == 90 || aci1 == 90 || aci3 == 90) {
//                    System.out.println("dik üçgen");
//
//                } else {
//                    System.out.println("üçgendir");
//
//                }

//                int aa;
//                aa = sc.nextInt();
//                if (aa > 5) {
//                    System.out.println("aa 5ten büyük ");
//                    if (aa > 25) {
//                        System.out.println("aa 25ten büyük");
//                        if (aa > 50) {
//                            System.out.println("aa 50den büyük");
//                        } else {
//                            System.out.println("aa 50 den küçük");
//                        }
//                    }else{
//                        System.out.println("aa 25 ten küçük");
//                    }
//                } else {
//                    System.out.println("aa 5ten küçük");
//
//                }


            }
        }
/*
        int tah;
        int sayia = 100;
        Scanner scan = new Scanner(System.in);
        tah = scan.nextInt();

        if (tah != sayia) {
            if (tah<sayia && tah <= sayia / 2) {
                System.out.println("çok uzaksın yukarı çık");

            } else if (tah == sayia - 1 || tah > sayia / 2) {
                System.out.println("yakınsın az yukarı çık");

            }
            if (tah>sayia && tah >= sayia + sayia / 2) {
                System.out.println("çok uzaksın aşağı in");

            } else  if (tah < sayia + sayia / 2 || tah == sayia + 1) {
                System.out.println("yakınsın az aşağı in");
           }

        } else {
            System.out.println("helal olsun bildin ");
        }*/


    }


}









