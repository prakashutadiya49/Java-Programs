
import java.util.ArrayList;
import java.util.Scanner;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        }

        if (root.data < val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    // search
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) {
            return search(root.left, key);
        }

        else if (root.data == key) {
            return true;
        }

        else {
            return search(root.right, key);
        }
    }

    // delete
    public static Node deleteNode(Node root, int val) {
        if (val < root.data) {
            return deleteNode(root.left, val);
        } else if (val > root.data) {
            return deleteNode(root.right, val);
        } else {// root.data==value

            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // case 3
            Node is = inordersuccessor(root.right);
            root.data = is.data;
            root.right = deleteNode(root.right, is.data);
            return root;
        }
    }

    public static Node inordersuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print range between two values(inclusive)
    public void printRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printRange(root.left, x, y);
            System.out.println(root.data + " ");
            printRange(root.right, x, y);
        } else if (root.data >= y) {
            printRange(root.left, x, y);
        } else {
            printRange(root.right, x, y);
            ;
        }
    }

    // all path
    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
    }

    public static void printallpath(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;
        // leaf
        if (root.left == null && root.right == null) {
            printpath(path);
            return;
        } else {// non leaf
            printallpath(root.left, path);
            printallpath(root.right, path);
        }
        path.remove(path.size() - 1);

    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] val = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        // construct tree
        for (int i = 0; i < val.length; i++) {
            insert(root, val[i]);
        }

        // preoder
        printInorder(root);
        System.out.println();

        // search element
        System.out.print("enter elemenyt that you need to search:");
        int key = s.nextInt();
        if (search(root, key)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        // delete
        // return root node of modified tree after deletetion
        @SuppressWarnings("unused")
        Node Root = deleteNode(root, 3);

        // print all path
        printallpath(root, new ArrayList<>());

    }
}
