package Trees.BST;



public class isBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert Function
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        }

        else if(val > root.data){
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder Traversal
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }



    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 20);
        root = insert(root, 4);
        root = insert(root, 6);

        inOrder(root);
    }
}
