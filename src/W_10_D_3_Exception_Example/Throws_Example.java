package W_10_D_3_Exception_Example;

public class Throws_Example {
    public static void main(String[] args) {

a_metot();
b_metot();
//c_metot(); hata verir
//d_metot(); hata verir

    }
    public static void a_metot(){

    }
    public static void b_metot()  {
       try {
           c_metot();
       }catch (Exception e){
           e.printStackTrace();
       }

    }
    public static void c_metot() throws InterruptedException {
      d_metot();
    }
    public static void d_metot() throws InterruptedException {
        Thread.sleep(3000);
    }
}
