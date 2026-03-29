package Queue;

import java.util.*;

public class QueueImp {
    public static void main(String[] args) {
        //Stack<Integer> st = new Stack<>();
        Queue<Integer> q1 =  new LinkedList<>(); //way 1
        System.out.println();

        q1.add(1); //inr 1
        q1.add(5); //inr 2
        q1.add(8); //inr 3

        System.out.println(q1);
        System.out.println(q1.peek()); // => 1 return top ele.

        System.out.println(q1.poll()); // => 1 return and remove the top elem.
        System.out.println(q1); //[5, 8]

        System.out.println(q1.size()); // 2 return the size of queue

        System.out.println(q1.isEmpty()); //return if queue is empty or not t/f


        //==============================================================================
        //Priorty Queue.
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); //min heap => min pq => Smallest element has highest priority.
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); //max heap or Max PQ => largest element has highest priority.

        // max priorty queue
        minPQ.add(15);
        minPQ.add(18);
        minPQ.add(2);
        minPQ.add(7);

        System.out.println(minPQ);//[2, 7, 15, 18]
        System.out.println(minPQ.poll()); // 2 remove and return min top ele
        System.out.println(minPQ.peek()); // 7 return top ele.
        System.out.println(minPQ.size()); //return the size of PQ
        System.out.println(minPQ.isEmpty());
        System.out.println(minPQ.offer(8));
        System.out.println(minPQ);

        // max priorty queue
        maxPQ.add(10);
        maxPQ.add(5);
        maxPQ.add(20);
        maxPQ.add(15);

        System.out.println(maxPQ);

    }
}
