package W_10_D_4_CollectionCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll=new ArrayList<>(Arrays.asList(3,5,7,10,20));
//        for (Integer each:cll){
//            System.out.println(each);
//            if(each>5){
//                cll.remove(each);
//            }
   //     }

        Iterator<Integer> myIter = cll.iterator();
/*
        //next
        System.out.println("next() = " + myIter.next());
        //System.out.println("next() = " + myIter.next());

        //remove (bu nexte bağlı)
        myIter.remove();       // [5, 7, 10, 20] 1.indexteki 3ü attı
        myIter.remove();       //hata verir önce next sonra remove olmalı
        System.out.println("cll = " + cll);

 */
        //[3,5, 7, 10, 20]

        while (myIter.hasNext()){
            Integer next = myIter.next();
            System.out.print( next);
            if (next>5){
                myIter.remove();
            }

        }

        System.out.println("cll = " + cll);
        System.out.println("myIter.hasNext() = " + myIter.hasNext());


    }}
