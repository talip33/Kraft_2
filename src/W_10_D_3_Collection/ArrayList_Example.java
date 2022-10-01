package W_10_D_3_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String>  arrayList=new ArrayList<>();
        arrayList.add("ahmet");
        arrayList.add("fff");
        arrayList.add("tt");
        arrayList.add("tt");
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        System.out.println(arrayList.size());
        arrayList.remove(3);
       // arrayList.clear();
        arrayList.set(2,"cml");
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());


        Scanner scan=new Scanner(System.in);

    }
}
