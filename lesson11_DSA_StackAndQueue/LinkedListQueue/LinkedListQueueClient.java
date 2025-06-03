package LinkedListQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(300);
        System.out.println(queue.getAllNodes());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getAllNodes());

        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(600);
        queue.dequeue();

        System.out.println(queue.getAllNodes());
        System.out.println(queue.dequeue().key);

    }
}
