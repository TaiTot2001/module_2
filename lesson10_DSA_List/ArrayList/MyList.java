package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkIndexForAdd(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void add(int index, E element) {
        checkIndexForAdd(index);
        ensureCapacity(size + 1);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        checkIndex(index);
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<E> newList = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            newList.add((E) elements[i]);
        }
        return (E) newList;
    }

    public E get(int i) {
        checkIndex(i);
        return (E) elements[i];
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size] = element;
        size++;
        return true;
    }

    public boolean contains(E o) {
        return indexOf(o) >=0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
}
