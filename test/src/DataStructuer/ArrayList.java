package DataStructuer;
public class ArrayList <T> {
    private int length;
    private int maxSize;
    private T arr[];
    @SuppressWarnings("unchecked")
    public ArrayList(int maxSize) {
        if (maxSize > 0) {
            this.length = 0;
            this.maxSize = maxSize;

            // إنشاء المصفوفة باستخدام Object ثم تحويلها إلى T[]
            this.arr = (T[]) new Object[maxSize];
        } else {
            throw new ArrayIndexOutOfBoundsException("size must greater than 0 ");
        }
    }
    
    public boolean isEmpty(){
        return length==0;
    }
    public boolean isFull(){
        return length==maxSize;
    }
    public int getMaxSize(){
        return maxSize;
    }
    public int getLength(){
        return length;
    }
    public void clear(){
        length =0 ;
    }

    public void print(){
        for (T t : arr) {
            System.out.print(t +"\t");
        }
    }
    public T retrive(int index){
        if (index>=0 && index<length) {
            return arr[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("location not extist");
        }
    }
    public void replace (int index ,T value){
        if (index>=0&& index<length) {
            arr[index]=value;
        } else {
            throw new ArrayIndexOutOfBoundsException("location not extist");
        }
    }
    public boolean isItem(int index ,T value){
        if (index>=0&& index<length) {
           return arr[index]==value;
        } else {
            throw new ArrayIndexOutOfBoundsException("location not extist");
        }
    }
    public int sequ(T value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value ) {
                return i ;
            }
        }
        return -1 ;
    }
    public void insert(T value){
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("location not extist");
        }
        else{
            arr[length++]=value;
        }
    }
    public void insertAt(int index ,T value){
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        if (index >= 0 && index <= length) { // السماح بالإدراج في نهاية القائمة
            // تحريك العناصر إلى اليمين
            for (int i = length; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            // إدراج العنصر الجديد
            arr[index] = value;
            length++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }
    public void remove(int index ) {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }
        else{
            if (index>=0 && index<length) {
                for (int i = index; i < length-1; i++) {
                    arr[i]=arr[i+1];
                }
                length--;
            
            }else {
                throw new ArrayIndexOutOfBoundsException("location not extist");
            }
        }
    }
    public void removeEnd(){
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }
        else{
            
            arr[length - 1] = null;
            length--;
        }
    }


    
}
/*
 * 
 * 
 *  // إنشاء ArrayList بسعة 5 عناصر
        ArrayList<String> myList = new ArrayList<>(5);

        // اختبار دالة isEmpty
        System.out.println("هل القائمة فارغة؟ " + myList.isEmpty());  // هيطبع: true

        // إضافة بعض العناصر باستخدام insert
        myList.insert("Hello");
        myList.insert("World");
        myList.insert("!");

        // طباعة القائمة بعد الإضافة
        System.out.println("القائمة بعد الإضافة:");
        myList.print();  // هيطبع: Hello   World   !   null   null

        // اختبار دالة getLength
        System.out.println("\nطول القائمة الحالي: " + myList.getLength());  // هيطبع: 3

        // اختبار دالة removeEnd (حذف العنصر الأخير)
        myList.removeEnd();
        System.out.println("القائمة بعد حذف العنصر الأخير:");
        myList.print();  // هيطبع: Hello   World   null   null   null

        // اختبار دالة insertAt لإضافة عنصر في موقع معين
        myList.insertAt(1, "Java");
        System.out.println("\nالقائمة بعد إدراج عنصر 'Java' في الموقع 1:");
        myList.print();  // هيطبع: Hello   Java   World   null   null

        // اختبار دالة replace لاستبدال عنصر في موقع معين
        myList.replace(0, "Hey");
        System.out.println("\nالقائمة بعد استبدال 'Hello' بـ 'Hey' في الموقع 0:");
        myList.print();  // هيطبع: Hey   Java   World   null   null

        // اختبار دالة remove لحذف عنصر من موقع معين
        myList.remove(1);
        System.out.println("\nالقائمة بعد حذف العنصر في الموقع 1:");
        myList.print();  // هيطبع: Hey   World   null   null   null

        // اختبار دالة sequ للبحث عن عنصر
        int index = myList.sequ("World");
        System.out.println("\nفهرس العنصر 'World': " + index);  // هيطبع: 1

        // اختبار دالة clear لمسح القائمة
        myList.clear();
        System.out.println("\nالقائمة بعد مسحها:");
        myList.print();  // هيطبع: null   null   null   null   null

        // اختبار دالة isFull لمعرفة هل القائمة ممتلئة
        System.out.println("\nهل القائمة ممتلئة؟ " + myList.isFull());  // هيطبع: false
    }
}
 */