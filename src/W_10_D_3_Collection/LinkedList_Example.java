package W_10_D_3_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class LinkedList_Example {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("ahmet");
        linkedList.add("fff");
        linkedList.add("tt");
        linkedList.add("cml");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.getFirst());



        Vector<String> vector=new Vector<>();
        vector.add("ahmet");
        vector.add("fff");
        vector.add("tt");
        vector.add("cml");

        System.out.println(vector.capacity());
        vector.ensureCapacity(5);





    }
         }