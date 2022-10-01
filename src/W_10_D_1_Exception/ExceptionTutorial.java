package W_10_D_1_Exception;

import java.util.Scanner;

public class ExceptionTutorial {
    public static void main(String[] args) {
       /* System.out.println("PROGRAm başladı");
        int arr[]=new int[3];
        System.out.println(arr[3]);
        System.out.println("PROGRAm bitti");*/


        System.out.println("PROGRAm başladı");
        for (int i = 0; i < 5; i++) {


        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");
        int x= scan.nextInt();
        System.out.println("bölüm");
        int y= scan.nextInt();
        if(y!=0){
            System.out.println("sonuc " + (x / y));
        }else{
            System.out.println("bölüm 0 olamaz");
        }
    }

    }

}
