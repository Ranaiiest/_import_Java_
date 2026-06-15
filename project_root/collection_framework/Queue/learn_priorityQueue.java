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



        // Java — Min-Heap by default
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        minH.offer(3); minH.offer(1); minH.offer(2); // or add() method can also be used
        minH.peek(); // 1 (min)
        minH.poll(); // 1 (removes min)
        minH.size();
        // Max-Heap
        PriorityQueue<Integer> maxH =
        new PriorityQueue<>(Collections.reverseOrder());
        // OR: new PriorityQueue<>((a,b) -> b-a);
        maxH.offer(3); maxH.offer(1); maxH.offer(2);
        maxH.peek(); // 3 (max)
        maxH.poll(); // 3 (removes max)
        maxH.size();




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