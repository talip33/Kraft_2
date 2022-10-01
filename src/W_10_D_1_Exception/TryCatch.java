package W_10_D_1_Exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("PROGRAm başladı");

       try{//hata alınması belenen kod blogu
           System.out.println("try bloğunun içi hata sonrası");
           int x=5/0;

           Thread.sleep(7000);

       } catch (Exception e){//hata alındıktan sonra yapılan işlem
           e.printStackTrace();
           System.out.println("catch bloğunun içi");
       }
        System.out.println("PROGRAm bitti");


    }
}
