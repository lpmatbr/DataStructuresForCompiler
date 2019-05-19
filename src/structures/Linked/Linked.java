package structures.Linked;

/**
 *
 * @author Sávio Andres
 * @param <E>
 */
public class Linked<E> {
    
    private Node<E> first, last;
    private int size;
    
    public void add(E element) {
        Node<E> node = new Node<>();
        node.setElement(element);
        
        if (first == null) {
            first = last = node;
        } else {
            last.setNext(node);
            node.setPrevious(last);
            last = node;
            last.setNext(null);
        }
        size++;
    }
    
    public E get(int position) {
        if (size == 0) {
            throw new NullPointerException("Não há elemento");
        } else if (position < 0 || position > size - 1) {
            throw new NullPointerException("Índice inválido");
        } else if (position == 0) {
            return first.getElement();
        } else if (position == size - 1) {
            return last.getElement();
        } else {
            Node<E> node;
            if (position < (size / 2)) {
                node = first;
                for (int i = 0; i < position; i++) {
                    node = node.getNext();
                }
            } else {
                node = last;
                for (int i = size - 1; i > position; i--) {
                    node = node.getPrevious();
                }
            }
            return node.getElement();
        }
    }
    
    public E peek() {
        return last.getElement();
    }
    
    public E pop() {
        Node<E> node;
        E element = last.getElement();
        node = last.getPrevious();
        last.setElement(null);
        last = node;
        last.setNext(null);
        size--;
        return element;
    }
    
    public int size() {
        return size;
    }
    
}
