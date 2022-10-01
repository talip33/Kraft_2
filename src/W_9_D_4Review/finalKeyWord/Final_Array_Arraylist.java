package W_9_D_4Review.finalKeyWord;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Final_Array_Arraylist {
    public static void main(String[] args) {

        final String[] batch2={"tt","alp"};
        batch2[0]="ibr";
        System.out.println(Arrays.toString(batch2));

//        batch2=new String[]{"ali","veli"};
//        System.out.println(Arrays.toString(batch2));
//        batch2 final oldugundan referansı degiştirilemez


        ArrayList<String> NAME=new ArrayList<>();
        NAME.add("ihsan");

        NAME=new ArrayList<>();
    }




}
