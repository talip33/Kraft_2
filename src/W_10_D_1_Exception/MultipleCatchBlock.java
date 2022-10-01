package W_10_D_1_Exception;

public class MultipleCatchBlock {//özelden ggenele yazmak lazım
    public static void main(String[] args) {
        //int arr[]=new int[3];

        System.out.println("prog başladı");
        try{
           //System.out.println(arr[5]);
            System.out.println((5 / 0));
        }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBoundsException yakalandı");
           System.out.println(e.getMessage());
       }catch (Exception e){
            System.out.println("Exception yakalandı");
            System.out.println(e.getMessage());
        }

        System.out.println("prog bitti");





    }
}
