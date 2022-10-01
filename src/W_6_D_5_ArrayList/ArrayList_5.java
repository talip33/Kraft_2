package W_6_D_5_ArrayList;

import java.util.ArrayList;

public class ArrayList_5 {
    //copy,conntains,containsAll
    public static void main(String[] args) {

        ArrayList<String> weekDays=new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wendesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        ArrayList<String> allDays=new ArrayList<>(weekDays);
        System.out.println("allDays.get(0) = " + allDays.get(0));

//        ArrayList<String> alternatifDay = allDays;
//        alternatifDay.set(0,"Pazartesi");
//        System.out.println("pazartesi eklendikten sora allDays = " + allDays);


        allDays.add("Saturday");
        allDays.add("Sunday");

        System.out.println("allDays = " + allDays);

        System.out.println("allDays.contains(Tuesday) = " + allDays.contains("Tuesday"));
        System.out.println("allDays.indexOf(Tuesday) = " + allDays.indexOf("Tuesday"));
        System.out.println("allDays.get(1)==\"Tuesday\" = " + allDays.get(1) == "Tuesday");
        System.out.println(allDays.equals("Tuesday"));



    }
}
