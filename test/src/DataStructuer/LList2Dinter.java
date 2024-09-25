package DataStructuer;

public interface LList2Dinter<E> {
    public void print();
    public void insertHead(E item);
    public E retriveLast();
    public E retriveFirst();
    public int Size();
    public void insert(E item);
    public void insertFirst(E  item);
    public boolean isEmpty();
    public int search(E item);
    public void removeFirst();
    public void removeLast();
    public void insertBefore(E item , E value);
    public void insertbefore(E item , E value);
    public void insertAfter(E item , E value);
    public void  remove(E item);
}
