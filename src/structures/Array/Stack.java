package structures.Array;

/**
 *
 * @author Sávio Andres
 * @param <E>
 */
public interface Stack<E> extends Iterable<E> {
    public void push(E element);
    public E pop();
    public E peek();
    public int size();
    public int search(E element);
    public boolean empty();
}
