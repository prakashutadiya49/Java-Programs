import java.util.LinkedList;
import java.util.Queue;

public class createBT {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int index = -1;
        static int c = 0;

        Node buildtree(int[] preorder) {
            index++;
            if (preorder[index] == -1) {
                return null;
            }
            Node node = new Node(preorder[index]);
            node.left = buildtree(preorder);
            node.right = buildtree(preorder);
            return node;
        }

        void getpreorder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            getpreorder(root.left);
            getpreorder(root.right);
        }

        void getinorder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            getinorder(root.left);
            System.out.print(root.data + " ");
            getinorder(root.right);
        }

        void getpostorder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            getpostorder(root.left);
            getpostorder(root.right);
            System.out.print(root.data + " ");

        }

        void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currentnode = q.remove();
                if (currentnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        return;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentnode.data + " ");
                    if (currentnode.left != null) {
                        q.add(currentnode.left);
                    }
                    if (currentnode.right != null) {
                        q.add(currentnode.right);
                    }
                }
            }
        }

        // count nodes
        int count(Node root) {
            int count = 0;
            if (root == null) {
                return count;
            }
            count++;

            count += count(root.left);
            count += count(root.right);
            return count;
        }

        // other method for count node
        int count1(Node root) {
            if (root == null) {
                return 0;
            }
            return count1(root.left) + count1(root.right) + 1;
        }

        // sum of all node data
        int countsum(Node root) {
            if (root == null) {
                return 0;
            }
            return countsum(root.left) + countsum(root.right) + root.data;
        }

        // height of tree
        public static int height(Node root) {
            if (root == null)
                return 0;
            int myheight = Math.max(height(root.left), height(root.right)) + 1;
            return myheight;
        }

        // max diameter of the binary tree tie complexity o(n^2)
        // case 1: height through left tree
        // case 2: height of left subtree
        // case 3: height of right subtree
        // max of all three case is actual max diameter

        int diameter(Node root) {

            if (root == null) {
                return 0;
            }
            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;

            return Math.max(dia1, Math.max(dia2, dia3));

        }

        // diameter second method time complexity o(n)
        // for each node calculate height and diameter and return upper node

        static class treeinfo {
            int ht;
            int diam;

            treeinfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        treeinfo diameter2(Node root) {
            if (root == null) {
                return new treeinfo(0, 0);
            }
            treeinfo left = diameter2(root.left);
            treeinfo right = diameter2(root.right);

            int myheight = 1 + Math.max(left.ht, right.ht);

            int d1 = left.diam;
            int d2 = right.diam;
            int d3 = left.ht + right.ht + 1;

            int mydiam = Math.max(d1, Math.max(d2, d3));
            return new treeinfo(myheight, mydiam);
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 }; // tree data in pre order
        binarytree BT = new binarytree();
        Node root = BT.buildtree(preorder);
        System.out.println(root.data);
        System.out.println("preoder of given root tree:");
        BT.getpreorder(root);
        System.out.println();
        System.out.println("inoder of given root tree:");
        BT.getinorder(root);
        System.out.println();
        System.out.println("postoder of given root tree:");
        BT.getpostorder(root);
        System.out.println();
        System.out.println("level order travrsal:");
        BT.levelorder(root);
        System.out.print("first method=> ");
        System.out.println("number of node in tree:");
        System.out.println(BT.count(root));
        System.out.print("second method=> ");
        System.out.println("number of node in tree:");
        System.out.println(BT.count1(root));
        System.out.println("sum of all node data: ");
        System.out.println(BT.countsum(root));
        System.out.println("height of tree:  " + BT.height(root));
        System.out.println("Maximum diameter in o(n^2):" + BT.diameter(root));
        System.out.println("Maximum diameter in o(n):" + BT.diameter2(root).diam);
    }
}
