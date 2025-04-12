package tasksGenerics;

public interface MyList<E> extends Cloneable {
    int getSize();
    void pushBack(E element);
    void pushFront(E element);
    void insert(E element, int index);
    E popFront();
    E popBack();
    void removeAt(int index);
    void remove(E element);
    void removeAll(E element);
    void clear();
    boolean isEmpty();
    void trimToSize();
    int indexOf(E element);
    int lastIndexOf(E element);
    void reverse();
    void shuffle();
    E getElementAt(int index);
    String toString();
    boolean equals(Object o);
    int hashCode();
    MyList<E> clone();
}
