package DataStructuer;

public class Tree<E extends Comparable<E>> {
    TLNode<E> root;

    // إدراج عنصر في الشجرة
    TLNode<E> insert(E d, TLNode<E> root) {
        if (root == null) {
            root = new TLNode<>(d);
        } else {
            int cmp = d.compareTo(root.data);
            if (cmp <= 0) {
                root.left = insert(d, root.left);
            } else {
                root.right = insert(d, root.right);
            }
        }
        return root;
    }

    // البحث عن عنصر في الشجرة
    TLNode<E> search(E d, TLNode<E> root) {
        if (root == null || root.data.equals(d)) {
            return root;
        }
        int cmp = d.compareTo(root.data);
        if (cmp < 0) {
            return search(d, root.left);
        } else {
            return search(d, root.right);
        }
    }

    // طباعة عناصر الشجرة بترتيب معين
    void inorder(TLNode<E> r) {
        if (r == null) {
            return;
        }
        inorder(r.left);
        System.out.println(r.data);
        inorder(r.right);
    }

    // حذف عنصر من الشجرة
    TLNode<E> delete(TLNode<E> root, E data) {
        if (root == null) {
            return root;
        }
        int cmp = data.compareTo(root.data);
        if (cmp < 0) {
            root.left = delete(root.left, data);
        } else if (cmp > 0) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // العثور على أصغر قيمة في الشجرة
    E minValue(TLNode<E> root) {
        E minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}
