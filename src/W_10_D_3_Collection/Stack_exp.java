package W_10_D_3_Collection;

import java.util.Objects;
import java.util.Stack;

public class Stack_exp {
    public static void main(String[] args) {
        Stack<Object> stack=new Stack<>();
        stack.add(true);
        stack.add(5);
        stack.add("hi");
        stack.add(8.8);
        stack.add('m');
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.push(2));


    }
}
