package DataStructuer;

public interface stackA <E>{
    public boolean isEmpty();
    public boolean isFull();
    
    public void push(E item);
    public void clear();
    
    public E peak();
    public E pop();
    public int size();
    public E search(E item);
}
