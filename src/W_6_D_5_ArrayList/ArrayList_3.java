package W_6_D_5_ArrayList;

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Ahmet");
        names.add("Mustafa");
        names.add("Talip");
        names.add("Alp");
        names.add("İhsan");
        names.add("Talha");
        names.add("Bilge");
        names.add("Bahar");
        names.add("Hatice");
        names.add("Çiğdem");
        System.out.println("names.size() = " + names.size());

        for (String str:names) {
            System.out.print(str+" ");
        }
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.println( names.get(i)+" ");

        }
        System.out.println("names.get(0) = " + names.get(0));

       int alp= names.indexOf("Alp");
        System.out.println("alp = " + alp);

        names.add("Hasan");
        System.out.println("names = " + names);

        names.set(3,"Hasan");
        System.out.println("names = " + names);

        System.out.println("names.indexOf(\"Hasan\") = " + names.indexOf("Hasan"));
        System.out.println("names.lastIndexOf(\"Hasan\") = " + names.lastIndexOf("Hasan"));

        names.remove("Hasan");// iki tane var ilk hasanı atar
        System.out.println("names = " + names);

        names.remove("Hasan");
        System.out.println("names = " + names);



    }
}
