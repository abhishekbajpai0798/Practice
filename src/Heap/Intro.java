package Heap;
/*
* heaps in java built by priority queue.
* Queue -> FIFO
* Operation made in terms of priority, order of elements is not same. by default smaller values has more priority.
* add(); -> log(n)
* remove(); -> log(n)
* peek(); ->O(1)
* poll();
*
* WAP about Rank List
* */

import java.util.Collections;
import java.util.PriorityQueue;

public class Intro {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqs = new PriorityQueue<>(); // by default it gives smaller value has more priority. (Min Heap)
        PriorityQueue<Integer> pql = new PriorityQueue<>(Collections.reverseOrder()); // this gives larger values has more priority. (Max Heap)
        int[] arr= {10,3,8,9,55,48,12,63,34,1};
        for(int val: arr){ // loop run nlogn times n-> loop and logn for add element in PQ.
            pqs.add(val);
            pql.add(val);
        }
        //it prints values smaller to larger
        while(!pqs.isEmpty()){
            System.out.println(pqs.peek());
            pqs.poll();
        }
        System.out.println("-------------------------------");
        //it prints values larger to smaller
        while(pql.size()>0){
            System.out.println(pql.peek());
            pql.remove();
        }
    }
}
