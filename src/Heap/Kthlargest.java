package Heap;

import java.util.PriorityQueue;

public class Kthlargest {
    public static void main(String[] args) {
        int k=3;
        int arr[]={7,10,4,3,20,15};
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                //pq.remove(pq.peek()); or
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
