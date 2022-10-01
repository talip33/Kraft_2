package W_6_D_5_ArrayList;

import java.util.ArrayList;

public class ArrayList_6 {
    public static void main(String[] args) {

        ArrayList<String> fruitInBasket=new ArrayList<>();

        //fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayısı");
        fruitInBasket.add("üzüm");
       // fruitInBasket.add("erik");

        ArrayList<String> fruitInPlate=new ArrayList<>();

        fruitInPlate.add("armut");
        fruitInPlate.add("kayısı");
        fruitInPlate.add("üzüm");

        //fruitInBasket.removeAll(fruitInPlate);
        System.out.println("fruitInBasket = " + fruitInBasket);

        System.out.println("fruitInPlate.equals(fruitInBasket) = " + fruitInPlate.equals(fruitInBasket));
        System.out.println( fruitInPlate == fruitInBasket);


        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(200);

        printlistNumber(listOfNums);

    }
    public static void printlistNumber(ArrayList<Integer>nums){
        for(Integer I:nums){
            System.out.print(I+"");
        }
    }

    public static int sum(ArrayList<Integer>nums){
        int sum=0;
        for(Integer I:nums){
            sum+=I;
        }
        return sum;

    }

    



}
