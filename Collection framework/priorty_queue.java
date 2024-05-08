import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class priorty_queue {

    public static void main(String[] args) {

        Queue<Integer>pq = new PriorityQueue<> (Comparator.reverseOrder()); // convert  in max heap method
        pq.offer(40);
        pq.offer(50);   // exiqute min heap
        pq.offer(20);
        pq.offer(89);
        System.out.println(pq);
        pq.poll();            // poll method
        System.err.println(pq);

        System.out.println(pq.peek());
        
        
    }


    
}
