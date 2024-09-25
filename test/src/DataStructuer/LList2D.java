package DataStructuer;

public class LList2D<E> implements LList2Dinter<E> {
    private node2d<E> head;
    private node2d<E> tail;
    private int size;
    public LList2D(){
        head=new node2d<E>();
        tail=new node2d<E>();
        size=0;
    }
    public boolean isEmpty(){
        return head==null||size==0;
    }
    public void insertFirst(E  item){
        node2d<E> newNode=new node2d<E>();
        newNode.setData(item);
        head =newNode;
        tail =newNode;
        size++;
    }
    public void insert(E item){
        if (isEmpty()) {
            insertFirst(item);
        } else {
            node2d<E> newNode=new node2d<E>();
            newNode.setData(item);
            tail.setNext(newNode);
            newNode.setPrevous(tail);
            size++;
            tail =newNode;
        }
    }
    public int Size(){
        return size;
    }
    public E retriveFirst(){
        return head.getData();
    }
    public E retriveLast(){
        return tail.getData();
    }
    public void insertHead(E item){
        if (isEmpty()) {
            insertFirst(item);
        } else {
            node2d<E> newNode=new node2d<E>();
            newNode.setData(item);
            newNode.setNext(head);
            head.setPrevous(newNode);
            head=newNode;
            size++;
        }
        
    }
    public void print(){
        node2d<E> z=new node2d<E>();
        z=head;
        while (z!=null) {
            System.out.println(z.getData()+"\t");
            z= z.getNext();
        }
        System.out.println("");
    }
    
    public int search(E item){
        node2d<E> z=new node2d<E>();
        z=head;
        int i=0;
        while (z!=null) {
            i++;
            if (z.getData().equals(item)) {
                return i;
            }
            z=z.getNext();
        }
        return -1;
    }


    public void removeFirst(){
        head=head.getNext();
        head.setPrevous(null);
        size--;
    }
    public void removeLast(){
        tail=tail.getPrevous();
        tail.setNext(null);
        size--;
    }
    public void insertAfter(E item , E value){
        int loc = search(item);
        if (loc!=-1) {
            node2d<E> newNode=new node2d<E>();
            newNode.setData(value);
            node2d<E> z=new node2d<E>();
            z=head;
            for (int i = 1; i < loc; i++) {
                z=z.getNext();
            }
            newNode.setNext(z.getNext());
            z.getNext().setPrevous(newNode);
            z.setNext(newNode);
            newNode.setPrevous(z);
            size++;
        } else {
            System.out.println("Item Not found");
        }
    } 

    public void insertbefore(E item , E value){
        int loc =search(item);
        if (loc!=-1) {
            node2d<E> newNode=new node2d<E>();
            newNode.setData(value);
            node2d<E> z=new node2d<E>();
            z=head;
            for (int i = 1; i < loc-1; i++) {
                z=z.getNext();
            }
            newNode.setNext(z.getNext());
            z.getNext().setPrevous(newNode);
            z.setNext(newNode);
            newNode.setPrevous(z);
            size++;
        } else {
            System.out.println("Item Not found");
        }
    } 
    public void insertBefore(E item, E value) {
        int loc = search(item);  // البحث عن موقع العنصر المراد الإدراج قبله
        if (loc != -1) {  // إذا وجدنا العنصر
            node2d<E> newNode = new node2d<>();  // إنشاء العقدة الجديدة
            newNode.setData(value);
            node2d<E> z = head;
    
            // التنقل حتى نجد العقدة التي تحتوي على العنصر
            for (int i = 1; i < loc; i++) {
                z = z.getNext();
            }
    
            // إذا كانت العقدة `z` هي العقدة الأولى في القائمة
            if (z == head) {
                newNode.setNext(head);  // العقدة الجديدة تشير إلى العقدة الأولى الحالية
                head.setPrevous(newNode);  // العقدة الأولى الحالية تشير إلى العقدة الجديدة كعقدة سابقة
                head = newNode;  // العقدة الجديدة تصبح العقدة الأولى
            } else {
                // الحالة العادية إذا لم تكن العقدة `z` هي العقدة الأولى
                newNode.setPrevous(z.getPrevous());  // العقدة الجديدة تشير إلى العقدة السابقة للعقدة `z`
                z.getPrevous().setNext(newNode);  // العقدة السابقة للعقدة `z` تشير الآن إلى العقدة الجديدة
                z.setPrevous(newNode);  // العقدة `z` تشير إلى العقدة الجديدة كعقدة سابقة
                newNode.setNext(z);  // العقدة الجديدة تشير إلى العقدة `z` كعقدة تالية
            }
    
            size++;  // زيادة حجم القائمة
        } else {
            System.out.println("Item not found");  // إذا لم يتم العثور على العنصر
        }
    }
    

    public void remove(E item) {
        int loc = search(item);  // البحث عن موقع العنصر المراد حذفه
        if (loc != -1) {  // إذا وجدنا العنصر
            node2d<E> z = head;
    
            // التنقل حتى نجد العقدة التي تحتوي على العنصر
            for (int i = 1; i < loc; i++) {
                z = z.getNext();
            }
    
            // إذا كانت العقدة المراد حذفها هي العقدة الأولى (head)
            if (z == head) {
                removeFirst();  // استخدم دالة إزالة العنصر الأول
            } 
            // إذا كانت العقدة المراد حذفها هي العقدة الأخيرة (tail)
            else if (z == tail) {
                removeLast();  // استخدم دالة إزالة العنصر الأخير
            } 
            // إذا كانت العقدة في المنتصف
            else {
                z.getPrevous().setNext(z.getNext());  // الربط بين العقدة السابقة والتالية
                z.getNext().setPrevous(z.getPrevous());  // تجاوز العقدة المراد حذفها
                size--;  // تقليل حجم القائمة
            }
        } else {
            System.out.println("Item not found");  // إذا لم يتم العثور على العنصر
        }
    }
    

}
