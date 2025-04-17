package StacksandQueues.Generic;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();


        // FIFO Based   


        q.add(21);
        q.add(19);

        q.add(27);

        q.add(39);



        System.out.println(q.remove());
        q.remove();

        System.out.println(q.peek());

      
    }
}

