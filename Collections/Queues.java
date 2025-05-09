package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Whenever you are using a proper queue we use a linkedlist to instantiate 

public class Queues {
    public static void main(String[] args) {
        
    //  QUEUE(FIFO) =>  If you want to implement QUEUE then use LINKEDLIST
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(6);
        System.out.println(queue.peek()); // insert 6 into queue
        System.out.println(queue.poll()); // remove 6 from queue since it was the 1st element inserted FIFO
        System.out.println(queue.peek()); // insert 1 into queue
        
        System.out.println(queue.isEmpty()); // Checks if the queue is empty

        System.out.println("----------------------STACK-----------------------");

    // STACK (LIFO) => If you want to use stack then use STACK CLASS  
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

        System.out.println("----------------------DEQUE-----------------------");
    //  If you want to implement the double ended queue then use ARRAYDEQUEUE CLASS
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerFirst(614);  // It adds "614" at first index so its now 614, 1, 2, 3

        deque.pollLast();   // removes last element i.e. 3
        deque.peekFirst();
        deque.pollFirst();     // removes first element i.e. 614
        System.out.println(deque);
    }
}
