package W_10_D_4_CollectionCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionStudy {
    public static void main(String[] args) {
     //   ArrayList<Integer> lst1=new ArrayList<>();
      //  List<Integer> lst2=new ArrayList<>();   //polymorphic way

        Collection<Integer> coll=new ArrayList<>();

        //adding element/object/item
        coll.add(5);
        coll.add(15);
        coll.add(25);  coll.add(251);  coll.add(2);
        System.out.println(coll);

        //getting size
        System.out.println("size() = " + coll.size());

        //remove
        coll.remove(15);
        System.out.println("coll = " + coll); //[5, 25, 251, 2]
        System.out.println(coll.remove(22));//false
        coll.add(11);coll.add(5); // [5, 25, 251, 2, 11, 5]
        System.out.println("coll = " + coll);
        coll.remove(5);  //[25, 251, 2, 11, 5] ilkni sildi
        System.out.println("coll = " + coll);

        //contains item
        System.out.println("contains(2) = " + coll.contains(2));//true
        System.out.println("contains(2500) = " + coll.contains(2500));//false

        //checking empty or not
        System.out.println("isEmpty() = " + coll.isEmpty());//false

       // removeAll
       // coll.removeAll(coll);
        //coll.removeAll(Arrays.asList(25,200));//yanlış sayı varsa sadece doğruyu siler
        System.out.println("coll = " + coll);

        //adding all
        coll.addAll(Arrays.asList(80,90,99));//[25, 251, 2, 11, 5, 80, 90, 99]
        System.out.println("coll = " + coll);

        //contains all
        System.out.println(coll.containsAll(Arrays.asList(25, 250)));//biri yanlışsa false

        //retains all [25, 251, 2, 11, 5, 80, 90, 99]
       // coll.retainAll(Arrays.asList(25,251)); //[25, 251] diğerlerini siler
      //  coll.retainAll(Arrays.asList(253333,25222)); //girilen degerler yoksa bos döndürür

        System.out.println("coll = " + coll);

        //turning to array
        Integer[] toArray=coll.toArray(new Integer[11]);
        //array = [25, 251, 2, 11, 5, 80, 90, 99, null, null, null]
        //(new Integer[11]);fazla deger girilirse null atar
        System.out.println("array = " + Arrays.toString(toArray));
    }
}
