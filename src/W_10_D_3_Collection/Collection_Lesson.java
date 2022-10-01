package W_10_D_3_Collection;

import java.util.Scanner;

public class Collection_Lesson {
    public static void main(String[] args) {
     veriAlYazdır();


    }
    public static void veriAlYazdır(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kac adet sayi girecksin");
        int x= scan.nextInt();
        int[] array=new int[x];
        for (int i = 0; i < array.length; i++) {
            System.out.print("sayi ");
            array[i]=scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
