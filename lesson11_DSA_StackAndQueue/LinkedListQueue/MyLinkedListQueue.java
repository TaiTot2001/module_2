package LinkedListQueue;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head=this.tail=temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue(){
        if(this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return temp;
    }
    public List<Integer> getAllNodes() {
        List<Integer> keys = new ArrayList<>();
        Node current = head;
        while (current!= null) {
            keys.add(current.key);
            current = current.next;
        }
        return keys;
    }
}
