package structures.Array;

import java.security.InvalidParameterException;

/**
 *
 * @author Sávio Andres
 * @param <E>
 */
public class Array<E> {
    private E[] elements;
    private int size, capacity;

    public Array() {
        capacity = 16;
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
    
    public E pop() {
        E element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }
    
    public E peek() {
        return elements[size - 1];
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
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
    
}
