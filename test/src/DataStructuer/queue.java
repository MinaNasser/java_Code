package DataStructuer;

public class queue <E>  implements QueueA<E>{
    private int front;
    private int rear;
    private int maxSize;
    private int n =0 ;
    private E arr[];
    
    @SuppressWarnings("unchecked")
    public queue(int maxSize){
        if (maxSize>0) {
            front =0;
            n=0 ;
        
            rear =-1;
            this.maxSize =maxSize;
            arr = (E[])new Object [this.maxSize];
        } else {
            front =0;
            rear =-1;
            n=0 ; 
            this.maxSize =25;
            arr = (E[])new Object [this.maxSize];
        }
    }

    @Override
    public boolean isEmpty() {
        return  n==0;
    }

    @Override
    public boolean isFull() {
        return n==maxSize;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void clear() {
        n=0;
        front=0;
        rear=-1;
    }

    @Override
    public E first() {
        try {
            if (isEmpty()) {
                throw new Exception("Queue is empty ");
            } else {
                return arr[front];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public E last() {
        try {
            if (isEmpty()) {
                throw new Exception("Queue is empty ");
            } else {
                return arr[rear];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void adQue(E item) {
        if (isFull()) {
            System.out.println("Queue is full ");
            
        } else {
            rear =(rear +1 )%maxSize;
            arr[rear]=item;
            n++;
        }
    }

    @Override
    public E deQue() {
        try {
            if (isEmpty()) {
                throw new Exception("Queue is empty ");
            } else {
                E temp = arr[front];
                front=(front +1)%maxSize;
                n--;
                return temp;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < n; i++) {
                int index = (front + i) % maxSize;  // حساب الفهرس الدائري
                System.out.print(arr[index] + " ");
            }
            System.out.println();  // للانتقال إلى سطر جديد بعد طباعة جميع العناصر
        }
    }

    


}
