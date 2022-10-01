package W_9_D_5_OOPReview.hidingCont;

public class YourCar extends MyCar{

    public static boolean haveSunroof(){

        return true;
    }
    public void getMyCarSunroofStatus(){
        System.out.println("my car have sunroof "+haveSunroof());
    }


}
