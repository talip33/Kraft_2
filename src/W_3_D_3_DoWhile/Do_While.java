package W_3_D_3_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

    /*    int i=1;
        do {
            System.out.println(i + "nci işlem");
            i++;

        }while(i<6);
        System.out.println(i);



//toplam 0 ise proramdan çık
        Scanner scan=new Scanner(System.in);
int k=0;
        do{
            System.out.println("1.sayi");
            int a=scan.nextInt();
            System.out.println("2.sayi");
            int b=scan.nextInt();
            System.out.println("toplam "+(a+b));

            i++;
            }while(k<5);







     boolean a=true;

        do{

          if (a==0 )false;
        }while(a);


        Scanner scan =new Scanner(System.in);
        Random random=new Random();
        int i= random.nextInt(50);

        System.out.println("Tuttuğum sayıyı bul bakalııııım 5 hakkın var");
        int j=1;
        do{
            System.out.print(j+" Tahmin: ");
            int tahmin= scan.nextInt();
            if(tahmin==i){
                System.out.println("tebrikler sayıyı buldun");
                break;
            }
            else if(tahmin>i){
                System.out.println("aşağı");
            }
            else{
                System.out.println("yukarı");
            }
            j++;
        }while(j<6);

        System.out.println("Tuttuğum sayı"+i);


        Scanner scan =new Scanner(System.in);

        while(true) {
            System.out.println("1.sayi");
            int a = scan.nextInt();
            System.out.println("2.sayi");
            int b = scan.nextInt();
            System.out.println("toplam " + (a + b));

            if (a + b == 50) {
                break;
            }
        }

        Scanner scan =new Scanner(System.in);
while (true){
    System.out.println("ne yapmak istiyorsun");
    System.out.println(" 1-topla\n 2-çıkar\n 3-çarp \n 4-böl\n 5-çıkış");
    System.out.println("seçim ");
    int i=scan.nextInt();
    if(i==1){
        System.out.println("toplama ");
        System.out.println("1.sayi ");
        int a=scan.nextInt();
        System.out.println("2.sayi ");
        int b=scan.nextInt();
        System.out.println("toplam = "+(a+b));
    }
    if(i==2) {
        System.out.println("çıkar ");
        System.out.println("1.sayi ");
        int a = scan.nextInt();
        System.out.println("2.sayi ");
        int b = scan.nextInt();
        System.out.println("toplam = " + (a - b));
    }
    if(i==3) {
        System.out.println("çarp ");
        System.out.println("1.sayi ");
        int a = scan.nextInt();
        System.out.println("2.sayi ");
        int b = scan.nextInt();
        System.out.println("toplam = " + (a * b));
    }
    if(i==4) {
        System.out.println("böl ");
        System.out.println("1.sayi ");
        int a = scan.nextInt();
        System.out.println("2.sayi ");
        int b = scan.nextInt();
        System.out.println("toplam = " + (a / b));
    }
    if(i==5){
    break;}
*/


    Scanner scan = new Scanner(System.in);

    Random rdm = new Random();
    int i = rdm.nextInt(50);
    System.out.println("tutulan sayıyı bil, 5 hakkın var");
    int j = 1;

 do{     System.out.println(j+" tahmin");
        int tahmin = scan.nextInt();

        if (tahmin == i) {
            System.out.println("bildin tebrikler");
            break;
        } else if (tahmin < i) {
            System.out.println("yukarı");

        } else {
            System.out.println("aşağı");

        }

     j++;
    }while(j<6);
            System.out.println(i);






}

    }














