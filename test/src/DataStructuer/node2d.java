package DataStructuer;

public class node2d <E>{
    private E data;
    private node2d<E> prevous; 
    private node2d<E> next; 
    public node2d(){
        data = null;
        prevous=null;
        next=null;
    }
    public node2d(E data){
        this.data = data;
        prevous=null;
        next=null;
    }
    

    public node2d(E data, node2d<E> prevous, node2d<E> next) {
        this.data = data;
        this.prevous = prevous;
        this.next = next;
    }
    
    public E getData() {
        return data;
    }
    public node2d<E> getPrevous() {
        return prevous;
    }
    public node2d<E> getNext() {
        return next;
    }
    public void setData(E data) {
        this.data = data;
    }
    public void setPrevous(node2d<E> prevous) {
        this.prevous = prevous;
    }
    public void setNext(node2d<E> next) {
        this.next = next;
    }
    




    
}
