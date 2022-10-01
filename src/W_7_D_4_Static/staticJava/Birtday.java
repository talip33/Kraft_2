package W_7_D_4_Static.staticJava;

public class Birtday {

     static int cakeslice=28;

     public void takeASlice(){

         cakeslice--;
     }
     public void takeASlice(int count) {
         cakeslice-=count;

     }
}
class main2{
    public static void main(String[] args) {
        Birtday zafer=new Birtday();
        Birtday enes=new Birtday();
        Birtday ramo=new Birtday();
        Birtday talha=new Birtday();
        Birtday rıdvan=new Birtday();
        Birtday ilyas=new Birtday();


        zafer.takeASlice(3);
        enes.takeASlice();
        ilyas.takeASlice();
        rıdvan.takeASlice(2);
        talha.takeASlice();
        ramo.takeASlice();

        System.out.println(ilyas.cakeslice);
    }
}