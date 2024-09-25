package DataStructuer;

public class node <E>{
    private E info;
    private node<E> next;
    node(){
        info = null;
        next= null;
    }
    node(E info){
        this.info=info;
        this.next= null;
    }
    

    public void setInfo(E info) {
        this.info = info;
    }

    public void setNext(node<E> next) {
        this.next = next;
    }
    public E getInfo() {
        return info;
    }
    public node<E> getNext() {
        return next;
    }
    
    

}
