class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
    }
}

public class BinarySearchTree {
    Node root;

    void insert(int k) {
        root = insertRec(root, k);
    }

    Node insertRec(Node r, int k) {
        if (r == null)
            return new Node(k);
        if (k < r.key)
            r.left = insertRec(r.left, k);
        else if (k > r.key)
            r.right = insertRec(r.right, k);
        return r;
    }

    void delete(int k) {
        root = deleteRec(root, k);
    }

    Node deleteRec(Node r, int k) {
        if (r == null)
            return r;
        if (k < r.key)
            r.left = deleteRec(r.left, k);
        else if (k > r.key)
            r.right = deleteRec(r.right, k);
        else {
            if (r.left == null)
                return r.right;
            else if (r.right == null)
                return r.left;
            r.key = minValue(r.right);
            r.right = deleteRec(r.right, r.key);
        }
        return r;
    }

    int minValue(Node r) {
        while (r.left != null)
            r = r.left;
        return r.key;
    }

    boolean search(int k) {
        return searchRec(root, k);
    }

    boolean searchRec(Node r, int k) {
        if (r == null)
            return false;
        if (r.key == k)
            return true;
        return k < r.key ? searchRec(r.left, k) : searchRec(r.right, k);
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node r) {
        if (r != null) {
            inorderRec(r.left);
            System.out.print(r.key + " ");
            inorderRec(r.right);
        }
    }

    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node r) {
        if (r != null) {
            System.out.print(r.key + " ");
            preorderRec(r.left);
            preorderRec(r.right);
        }
    }

    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node r) {
        if (r != null) {
            postorderRec(r.left);
            postorderRec(r.right);
            System.out.print(r.key + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        t.insert(50);
        t.insert(30);
        t.insert(20);
        t.insert(40);
        t.insert(70);
        t.insert(60);
        t.insert(80);
        System.out.println("Inorder:");
        t.inorder();
        t.delete(20);
        t.delete(30);
        System.out.println("After deletion:");
        t.inorder();
        System.out.println("Search 70: " + t.search(70));
        System.out.println("Preorder:");
        t.preorder();
        System.out.println("Postorder:");
        t.postorder();
    }
}
