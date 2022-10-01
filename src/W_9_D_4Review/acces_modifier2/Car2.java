package W_9_D_4Review.acces_modifier2;

import W_9_D_4Review.acces_modifier1.Car1;

public class Car2 extends Car1 {

    @Override
    public void method2() {
        super.method2();
    }

    @Override
    protected void method4() {
        super.method4();
    }

    public Car2(){
       // model="mazda";
        engine=1.6;
        year=2011;
        //door=4;
    }
}
