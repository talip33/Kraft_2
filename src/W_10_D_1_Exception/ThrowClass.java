package W_10_D_1_Exception;

public class ThrowClass {
    public static void main(String[] args) {
        int x = 0;

        try {
            if (x == 0) {
                throw new ArithmeticException("aritmetik exception hatası");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        //kullanıcıdan bir sayı alın ve bu sayının
        // faktoriyelini alarak ekrana sonucu yazdırın


    }
    public static void throwMetot(int x){
        System.out.println();

    }
}

