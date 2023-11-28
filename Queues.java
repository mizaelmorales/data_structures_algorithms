import java.util.*;
public class Queues {
    //FIFO
    //add = enqueue, offer()
    //remove = dequeue, poll()
    //Uses:
    //Keboard buffer
    //Printer queue jobs in order
    //used linkedlists priorityqueues,breadth-first search
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        Queue<String> queuePriority = new  PriorityQueue<>(Collections.reverseOrder());

        queue.offer("Miza");
        queue.offer("Luhen");
        queue.offer("Jacinto");

        System.out.println(queue.peek());
        System.out.println(queue);
        queue.poll();
        System.out.println(queue.contains("Miza"));
        System.out.println(queue);
    }
}
