package W_10_D_5ColletionCont;

import java.util.Arrays;
import java.util.Stack;

public class stackStudy {
    public static void main(String[] args) {
        //LİFO
        //push

        Stack<Integer> stc=new Stack<>();
        stc.addAll(Arrays.asList(2,4,6,7,9));
        System.out.println("stc = " + stc);

        stc.push(11);
        System.out.println("stc = " + stc);//[2, 4, 6, 7, 9, 11]

        //pop
        System.out.println("stc.pop() = " + stc.pop());//pop remove yapar
        //remove yaptığı degeri döndürür
        System.out.println("stc = " + stc);//[2, 4, 6, 7, 9]

        //peek
        System.out.println("stc.peek() = " + stc.peek());  // 9

        //seach
        System.out.println("stc.search(7) = " + stc.search(7));//2.sırada
        System.out.println("stc.search(25) = " + stc.search(25));// -1 yoksa


    }
}
