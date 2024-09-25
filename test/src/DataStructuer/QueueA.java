package DataStructuer;

public interface QueueA <E>{
    public boolean isEmpty();
    public boolean isFull();
    public void clear();
    public E first();
    public E last();
    public void adQue(E item);
    public E deQue();
    public int size();
    

    
}
