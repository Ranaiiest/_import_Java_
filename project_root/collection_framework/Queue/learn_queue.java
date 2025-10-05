import java.util.LinkedList;
import java.util.Queue;

// MindMap: Queue -> FIFO (First In First Out) data structure
// -> to insert : offer() or add() method
// -> to remove : poll() or remove() method
// -> to access : peek() or element() method
// -> implementations : LinkedList, PriorityQueue


public class learn_queue {
    public static void main(String[] args) {
        // creating a queue
        Queue<Integer> q = new LinkedList<Integer>();

        // inserting ele
        q.offer(1); // adds an ele to the end of the queue t.c = O(1)
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);

        // removing ele
        q.poll(); // removes the front ele and returns it t.c = O(1)
        System.out.println(q);

        // accessing ele
        int front_ele = q.peek(); // returns the front ele without removing it t.c = O(1)
        System.out.println("Front ele: " + front_ele);
        System.out.println(q.isEmpty()); // to check if the queue is empty or not t.c = O(1)
        System.out.println(q.size()); // to get the size of the queue t.c = O(1)

        // traversing a queue
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
