package DataStructuer;

public interface LLinter<E>{
    public void removeAfter(E item);
    public void insertAfter(E newItem);
    public void  removeAt(int loc);
    public void inseartAt(E item ,int loc);
    public node<E> search(E item);
    public void removeHead();
    public void clear();
    public void print();
    public int sizeLinked();
    public E reteiveTail();
    public E reteiveHead();
    public void addHead(E item);
    public void add(E item);
    public boolean isEmpty();
}
