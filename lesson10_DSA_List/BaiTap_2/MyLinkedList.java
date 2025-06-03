package BaiTap_2;
public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        numNodes++;
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        numNodes--;
        return temp.data;
    }

    public E removeLast() {
        if (head == null) return null;
        if (head.next == null) {
            Node temp = head;
            head = null;
            numNodes--;
            return temp.data;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = null;
        numNodes--;
        return temp.data;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == numNodes - 1) {
            return removeLast();
        }
        Node previous = head;
        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }
        Node current = previous.next;
        previous.next = current.next;
        numNodes--;
        return current.data;
    }

    public boolean remove(E e) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    @Override
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            clonedList.addLast(current.data);
            current = current.next;
        }
        return clonedList;
    }

    public boolean contains(E o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity <= numNodes) return;
        for (int i = numNodes; i < minCapacity; i++) {
            addLast(null);
        }
    }
    public E get(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public E getFirst() {
        if (head == null) return null;
        return head.data;
    }
    public E getLast() {
        if (head == null) return null;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }
    public void clear() {
        head = null;
        numNodes = 0;
    }
}

