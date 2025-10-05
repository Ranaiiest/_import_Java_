import java.util.*;


public class learn_priorityQueue{
    public static void main(String[] args){
        // creating a priority queue (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // min-heap by default

        // inserting ele t.c = O(log n) , we can also use pq.offer(val) to insert ele
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);
        System.out.println(pq); // the internal representation may not be in sorted order

        // accessing ele we can also use pq.element() to access the top ele
        int top_ele = pq.peek(); // returns the smallest ele without removing it t.c = O(1)
        System.out.println("Top ele: " + top_ele);

        // removing ele we can also use pq.remove() to remove the top ele
        pq.poll(); // removes the smallest ele and returns it t.c = O(log n)
        System.out.println(pq);

        System.out.println(pq.isEmpty()); // to check if the priority queue is empty or not t.c = O(1)
        System.out.println(pq.size()); // to get the size of the priority queue t.c = O(1)

        // traversing a priority queue (t.c = O(n log n) as each poll operation takes O(log n))
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // creating a max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(4);
        System.out.println(maxHeap);

    }
}