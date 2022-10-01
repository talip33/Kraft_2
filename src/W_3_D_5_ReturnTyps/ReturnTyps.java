package W_3_D_5_ReturnTyps;

import java.util.Scanner;

public class ReturnTyps {
    public static void main(String[] args) {

       // System.out.println(ayni(15,45));
      //  boolean c=ayni(15,22);
       // System.out.println(c);
        //System.out.println(primeNo(25));
        //System.out.println(dersNotu(23,62,20));
       // System.out.println(dersNotu(80,80,80));
       // System.out.println(dersNotu(20,77,20));
        startProcess();



    }


    public static boolean ayni(int a,int b){
        if((a%10)==(b%10)){
            return true;
        }

    return false;
}

      public static boolean primeNo(int num){

        if(num==0 || num==1){
            return false;
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    return false;
                }
            }
        }

return true;

    }

    public static int positiv(int sayi){
        return sayi>0 ? sayi: -sayi;

        //return Math.abs(sayi);




    }
    public static char dersNotu(double not1,double not2,double not3){
        double ort=((not1+not2+not3)/3);
         char not='X';
        if(ort>=76 && ort<=100){
            //return 'A';
        }else if ((ort>=51 && ort<=75)){
           // return 'B';
        } else if (ort>=0 && ort<=50) {
           // return 'C';

        }

        return not;
    }



    public static void calculateArea(int a,int b){


        System.out.println(a*b);


    }

    public static void calculateArea(int r){
       double PI=3.14;
        System.out.println(PI * r * r);
    }
    public static void concat(boolean bl,int i,String str){



}
    /*
        Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
        metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
        başka bir metodtan geçirin ve 3 katı olacak şekilde size
        döndürsün. Sonra bu sayıları kabul eden başka bir
        metotla da sayıları toplayın.
        */
    public static void startProcess() {
    Scanner scan=new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayia=scan.nextInt();
        int sayib=scan.nextInt();
        if(sayib%3!=0){
            multiple3(sayia,makeMultipleOfThree(sayib));

        }else{
            multiple3(sayia,sayib);

        }
    }

    public static int makeMultipleOfThree(int a) {
        int multiple3;
        if(a%3>1){
            multiple3=a+1;

        }else{
            multiple3=a-1;
        }
        return multiple3;
    }
    public static void multiple3(int a,int b){
        System.out.println(a+b);

    }


}
