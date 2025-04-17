package StacksandQueues.Generic;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();

        // FILO Based


        stk.push(23);
        stk.push(3);

        stk.push(17);

        stk.push(9);

        stk.push(69);

        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());

    }
    
}
