package DataStructuer;

class HashTable<K, V> {
    private HashNode<K, V>[] chainArray;
    private int numBuckets;
    private int size;

    // بناء الجدول
    @SuppressWarnings("unchecked")
    public HashTable() {
        chainArray = new HashNode[10];  // حجم مبدئي 10
        numBuckets = 10;
        size = 0;
    }

    // دالة لحساب قيمة التجزئة
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % numBuckets);
    }

    // دالة لإضافة (أو تحديث) العنصر في الجدول
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = chainArray[bucketIndex];

        // تحقق إذا كان العنصر موجودًا بالفعل، قم بالتحديث
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // إذا لم يكن موجودًا، أضف العنصر الجديد
        size++;
        head = chainArray[bucketIndex];
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = head;
        chainArray[bucketIndex] = newNode;

        // إذا زادت السعة عن حد معين، قم بإعادة التوزيع (rehash)
        if ((1.0 * size) / numBuckets >= 0.7) {
            rehash();
        }
    }

    // دالة للحصول على قيمة بناءً على المفتاح
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = chainArray[bucketIndex];

        // ابحث عن المفتاح في السلسلة
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        // إذا لم يتم العثور عليه
        return null;
    }

    // دالة لإزالة عنصر بناءً على المفتاح
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = chainArray[bucketIndex];

        // ابحث عن العقدة المراد حذفها
        HashNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }

        // إذا لم يتم العثور على المفتاح
        if (head == null) {
            return null;
        }

        size--;

        // إزالة العقدة
        if (prev != null) {
            prev.next = head.next;
        } else {
            chainArray[bucketIndex] = head.next;
        }

        return head.value;
    }

    // دالة لإعادة التوزيع (rehash) إذا امتلأ الجدول
    @SuppressWarnings("unchecked")
    private void rehash() {
        HashNode<K, V>[] temp = chainArray;
        chainArray = new HashNode[2 * numBuckets];
        numBuckets = 2 * numBuckets;
        size = 0;

        for (HashNode<K, V> headNode : temp) {
            while (headNode != null) {
                put(headNode.key, headNode.value);
                headNode = headNode.next;
            }
        }
    }

    // دالة للتحقق من حجم الجدول
    public int size() {
        return size;
    }

    // دالة للتحقق مما إذا كان الجدول فارغًا
    public boolean isEmpty() {
        return size == 0;
    }
}

