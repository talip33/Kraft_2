package W_10_D_1_Exception;

import java.util.Scanner;

public class fatoriyel {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın ve bu sayının
        // faktoriyelini alarak ekrana sonucu yazdırın
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(faktoriyel(x));
    }

    public static int faktoriyel(int n) {
        int result = 1;
        if (n < 0) {
            return -1;
        } else {
            for (int i = 0; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static int faktoriyel2(int n) {
        int result = 1;
        try {
            if (n < 0) throw new Exception("sayı 0 dan küçük olamaz");
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

        return result;


    }


}