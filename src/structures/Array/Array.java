package structures.Array;

import java.security.InvalidParameterException;
import java.util.Iterator;

/**
 *
 * @author Sávio Andres
 * @param <E>
 */
public class Array<E> implements Stack<E> {
    private E[] elements;
    private int size, capacity;

    public Array() {
        capacity = 10;
        size = 0;
        elements = (E[]) new Object[capacity];
    }
    
    public void add(E element) {
        capacity();
        elements[size] = element;
        size++;
    }
    
    public E get(int position) {
        tryPosition(position);
        return elements[position];
    }
    
    @Override
    public E pop() {
        E element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }
    
    @Override
    public E peek() {
        return elements[size - 1];
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean empty() {
        return size == 0;
    }
    
    @Override
    public void push(E element) {
        capacity();
        elements[size] = element;
        size++;
    }

    @Override
    public int search(E element) {
        int count = 1;
        for (int i = size - 1; i >= 0; i--) {
            if (element.equals(elements[i])) {
                return count;
            }
            count++;
        }
        return -1;
    }
    
    private void capacity() {
        if (size == capacity) {
            int newCapacity = capacity + (capacity / 2);
            E[] newVector = (E[]) new Object[newCapacity];
            System.arraycopy(elements, 0, newVector, 0, size);
            elements = newVector;
            capacity = newVector.length;
        }
    }
    
    private void tryPosition(int posistion) {
        if (posistion < 0 || posistion >= size) {
            throw new InvalidParameterException("Posição inválida");
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorVector();
    }
    
    private class IteratorVector implements Iterator<E> {

        private int currentPosition = 0;
        
        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public E next() {
            return elements[currentPosition++];
        }
        
    }
    
}
