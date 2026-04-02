public class SplayDemo {

    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    // Simple BST insert (for demo purpose)
    public Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    // Simple search (simulate access)
    public boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.key == key)
            return true;
        else if (key < root.key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        SplayDemo tree = new SplayDemo();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 5);

        System.out.println("Inorder traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nSearch 20: " + tree.search(tree.root, 20));
    }
}