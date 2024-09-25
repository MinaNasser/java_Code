package DataStructuer;

public class LinkedL<E> implements LLinter<E> {
   private node<E> head;
   private node<E> tail;
   private int size;
   public LinkedL(){
     head=null;
     tail=null;
     size=0;
   }
   public boolean isEmpty(){
     return head==null;
   }
   public void add(E item){
     if (isEmpty()) {
          node<E> newNode= new node<E>();
          newNode.setInfo(item);
          newNode.setNext(null);
          head=newNode;
          tail=newNode;
          size++;

     } else {
          node<E> newNode= new node<E>();
          newNode.setInfo(item);
          newNode.setNext(null);
          tail.setNext(newNode);
          tail=newNode;
          size++;
     }
   }
   public void addHead(E item){
     if (isEmpty()) {
          add(item);
     } else {
          node<E> newNode =new node<E>();
          newNode.setInfo(item);
          newNode.setNext(head);
          head =newNode;
          size++;
          
     }
   }
   public E reteiveHead(){
     return head.getInfo();
   }
   public E reteiveTail(){
     return tail.getInfo();
   }
   public int sizeLinked(){
     return size;
   }
   public void print(){
     node<E> z =new node<E>();
     z=head;
     while (z!=null) {
          System.out.print(z.getInfo()+"\t");
          z=z.getNext();
     }
     System.out.println("");
   }
   public void clear(){
     head =null;
     tail=null;
     size=0;

   }
   public void removeHead(){
     if (isEmpty()) {
          System.out.println("Linked List is Empty");
     } else {
          head =head.getNext();
          size--;

     }

   }
   public node<E> search(E item){
     try {
          if (isEmpty()) {
               throw new Error("Liked List is empty");
          } else {
               node<E> z =new node<E>();
               while (z!=null) {
                    if (z.getInfo()==item) {
                         return z;
                    }

                    z =z.getNext();
               }
               throw new Error("Item Not found");
          }
     } catch (Exception e) {
          System.out.println(e.getMessage());
          return null;
     }
   }
   public void inseartAt(E item ,int loc){
     if (loc>0) {
          node<E> newNode =new node<E>();
          newNode.setInfo(item);
          node<E> z =new node<E>();
          z=head;
          for (int i = 0; i < loc-1; i++) {
               z=z.getNext();
          }
          newNode.setNext(z.getNext());
          z.setNext(newNode);
          size++;
          
     } 
   }
   public void  removeAt(int loc){
     if (isEmpty()) {
          System.out.println("Empty");

     } else {
          node<E> z =new node<E>();
          z= head; 
          for (int i = 1; i <loc-1; i++) {
               z=z.getNext();
          }
          node<E> newNode =new node<E>();
          newNode=z.getNext();
          z.setNext(newNode.getNext());
          size--;
     }
     

      
   }
   public void insertAfter(E newItem) {
    // ابحث عن العنصر السابق للإدراج
    node<E> current = head;
    
    // إذا كانت القائمة فارغة، لا حاجة للقيام بأي شيء
    if (isEmpty()) {
        System.out.println("The list is empty.");
        return;
    }
    
    // ابحث عن العقدة التي تحتوي على قيمة معينة
    while (current != null) {
        if (current.getInfo() != null && current.getInfo().equals(newItem)) {
            // إذا تم العثور على العقدة، أضف العقدة الجديدة بعدها
            node<E> newNode = new node<E>();
            newNode.setInfo(newItem);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            
            // إذا كانت العقدة الجديدة هي العقدة الأخيرة، قم بتحديث الذيل
            if (newNode.getNext() == null) {
                tail = newNode;
            }
            
            size++;
            return;
        }
        current = current.getNext();
    }
    
    // إذا لم يتم العثور على العقدة، قم بطباعة رسالة
    System.out.println("The item to insert after was not found.");
     }
   public void removeAfter(E item) {
          node<E> current = head;
      
          // إذا كانت القائمة فارغة، قم بطباعة رسالة
          if (current == null) {
              System.out.println("The list is empty.");
              return;
          }
      
          // ابحث عن العقدة التي تحتوي على القيمة المحددة
          while (current != null) {
              if (current.getInfo().equals(item)) {
                  // تحقق مما إذا كانت هناك عقدة بعد العقدة الحالية
                  if (current.getNext() != null) {
                      // العقدة التالية هي العقدة التي سيتم إزالتها
                      node<E> nodeToRemove = current.getNext();
                      current.setNext(nodeToRemove.getNext());
      
                      // إذا كانت العقدة التي سيتم إزالتها هي العقدة الأخيرة، قم بتحديث الذيل
                      if (nodeToRemove == tail) {
                          tail = current;
                      }
      
                      size--;
                      return;
                  } else {
                      System.out.println("No node to remove after the specified item.");
                      return;
                  }
              }
              current = current.getNext();
          }
      
          // إذا لم يتم العثور على العقدة، قم بطباعة رسالة
          System.out.println("Item not found.");
      }
      
   
}