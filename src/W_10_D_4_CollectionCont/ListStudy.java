package W_10_D_4_CollectionCont;

import java.util.*;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> lst1 =new LinkedList<>(Arrays.asList(10,20,40,80,101));
        System.out.println("lst1 = " + lst1);

        //accessing items
        System.out.println("get(0) = " + lst1.get(0));

        //adding items with index
        lst1.add(0,11);//[11, 10, 20, 40, 80, 101]
        System.out.println(lst1);
        System.out.println("get(0) = " + lst1.get(0));

        //updating items
        lst1.set(0, 10);//[10, 10, 20, 40, 80, 101]
        System.out.println(lst1);

        //getting index of item
        System.out.println(lst1.indexOf(10));
        System.out.println(lst1.indexOf(40));
        System.out.println(lst1.indexOf(40222));//-1

        //remove with index no
        lst1.remove(0);
        System.out.println(lst1);//[10, 20, 40, 80, 101]

        //add all
        lst1.addAll(Arrays.asList(60,90));//[10, 20, 40, 80, 101, 60, 90]
        System.out.println("lst1 = " + lst1);
        lst1.addAll(2,Arrays.asList(30,33));//10, 20, 30, 33, 40, 80, 101, 60, 90]
        System.out.println("lst1 = " + lst1);

        //sort
       // lst1.sort(null);
        System.out.println("lst1 = " + lst1);//10, 20, 30, 33, 40, 60, 80, 90, 101]
       // lst1.sort(Comparator.naturalOrder());
        System.out.println("lst1 = " + lst1);
        lst1.sort(Comparator.reverseOrder());//[101, 90, 80, 60, 40, 33, 30, 20, 10]
        System.out.println("lst1 = " + lst1);

        //sublist(from,to)
        System.out.println("subList(2,6) = " + lst1.subList(2, 6));//[80, 60, 40, 33]
        List<Integer> subList3_8 = lst1.subList(3, 8);
        System.out.println("subList3_8 = " + subList3_8);//60, 40, 33, 30, 20]
        System.out.println("lst1 = " + lst1);
        subList3_8.set(1,558);
        System.out.println("subList3_8 = " + subList3_8);//[60, 558, 33, 30, 20]
        System.out.println("lst1 = " + lst1);
        lst1.set(5,600);
        System.out.println("lst1 = " + lst1);
        System.out.println("subList3_8 = " + subList3_8);

         //BURDAN BAŞLADIK 30,09 CUMA
        //List<Integer> lst1 =new LinkedList<>(Arrays.asList(10,20,40,80,101));

        //list iterator  [101, 90, 80, 60, 558, 600, 30, 20, 10]
        ListIterator<Integer> listIterator=lst1.listIterator();
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
       // System.out.println("listIterator.next() = " + listIterator.next());

        while (listIterator.hasNext()){
            Integer next=listIterator.next();
            System.out.println(next);
            if(next>40){
                listIterator.remove();
            }
        }
        System.out.println(lst1);//[30, 20, 10]
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        System.out.println("listIterator.hasPrevious() = " + listIterator.hasPrevious());
        System.out.println("listIterator.previous() = " + listIterator.previous());

        while (listIterator.hasPrevious()){
            Integer previous=listIterator.previous();
            if (previous<40){
              //  listIterator.set(2022);//[2022, 2022, 10]
                listIterator.add(333);
            }
        }
        System.out.println(lst1);


    }
}
