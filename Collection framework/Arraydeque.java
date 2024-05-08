import java.util.ArrayDeque;

public class Arraydeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(24);     // offer
        adq.offer(50); 
        adq.offerFirst(12); // offerFIrst 

        adq.offerLast(30);  // offerLast  

        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());    // peek First

        System.err.println(adq.peekLast()); // peek last 

        System.out.println(adq.poll()); // poll 

        System.out.println(adq.pollFirst());// poll First
        
        System.out.println(adq.pollLast());  // poll last



         






        
    }


    
}
