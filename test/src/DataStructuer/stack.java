package DataStructuer;
import java.util.Arrays;
public class stack <E> implements stackA <E> {
    private int stackTop;
    private int maxSize=50 ;
    private E sta[];
    @SuppressWarnings("unchecked")
    public stack( int maxSize) {
        if (maxSize>0) {
            
            this.maxSize= maxSize;
            sta = (E[]) new Object [this.maxSize]; 
            this.stackTop=-1;

        }else{
            this.maxSize =100;
        }
    }
    @Override
    public boolean isEmpty() {
        return this.stackTop==-1;
    }
    @Override
    public boolean isFull() {
        return this.stackTop+1 ==this.maxSize;
    }
    @Override
    public void push(E item) {
        if (isFull()) {
            //System.out.println("Stack is Full");
            sta = Arrays.copyOf(sta ,2*maxSize);
            sta[++this.stackTop]=item;
        } else {
            sta[++this.stackTop]=item;
        }
    }
    @Override
    public void clear() {
        this.stackTop =-1;
    }
    @Override
    public E peak() {
        try {
            if (isEmpty()) {
                throw new Exception("The stack is empty");
            } else {
                return sta[this.stackTop];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());  // طباعة رسالة الخطأ
            return null;
        }
        
        
    }
    @Override
    public E pop() {
        try {
            if (isEmpty()) {
                throw new Exception("The stack is empty");
            } else {
                E temp = sta [stackTop];
                stackTop--;
                return temp;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());  // طباعة رسالة الخطأ
            return null;
        }
    }
    @Override
    public int size() {
        return this.stackTop+1;
    }
    @Override
    public E search(E item) {
        try {
            if (isEmpty()) {
                throw new Exception("Stack Empty ");
            } else {
                for (int i = stackTop; i >=0; i--) {
                    if (sta[i]==item) {
                        return sta[i];
                    }
                }
                throw new Exception("Not found ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
/*stack<String> myStack = new stack<>(5);

        // Test isEmpty function
        System.out.println("Is the stack empty? " + myStack.isEmpty());  // Expected output: true

        // Add some elements using push
        myStack.push("Hello");
        myStack.push("World");
        myStack.push("!");

        // Test peak function to show the top element
        System.out.println("Top element in the stack: " + myStack.peak());  // Expected output: !

        // Test size function to know the number of elements
        System.out.println("Number of elements in the stack: " + myStack.size());  // Expected output: 3

        // Remove an element from the stack using pop
        System.out.println("Popped element: " + myStack.pop());  // Expected output: !

        // Show the top element after pop
        System.out.println("Top element in the stack after pop: " + myStack.peak());  // Expected output: World

        // Add elements until the stack is full
        myStack.push("Java");
        myStack.push("Stack");
        myStack.push("Full");

        // Try to add a new element to a full stack
        myStack.push("Overflow");  // Expected output: Stack is Full

        // Test isFull function
        System.out.println("Is the stack full? " + myStack.isFull());  // Expected output: true

        // Clear the stack
        myStack.clear();
        System.out.println("Number of elements in the stack after clearing: " + myStack.size());  // Expected output: 0

        // Test pop when trying to remove an element from an empty stack
        System.out.println("Trying to pop from an empty stack: " + myStack.pop());  // Expected output: The stack is empty
     */