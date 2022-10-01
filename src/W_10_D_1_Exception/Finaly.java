package W_10_D_1_Exception;

public class Finaly {
    public static void main(String[] args) {

        System.out.println("PROGRAm başladı");
        try{
            System.out.println("try bloğunun içi hata sonrası");
        int x=5/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("catch bloğunun içi");

        }
        finally {
            System.out.println("finaly bloğunun içi");

        }
        System.out.println("PROGRAm bitti");

    }

}
