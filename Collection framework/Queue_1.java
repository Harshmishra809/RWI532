// Queue follow fifo method

import java .util.Queue;
import java.util.LinkedList;



public class Queue_1 {

    public static void main(String[] args) {

        Queue<Integer> numbers= new LinkedList<> ();

        numbers.offer(20);   //  offers method 
        numbers.offer(40);
        numbers.offer(50);
        numbers.offer(60);
        System.out.println(numbers);


         System.out.println(numbers.poll());  // poll method
         System.out.println(numbers);
         System.out.println(numbers.peek());   // peek method

        

            
        };


        
    }
    

