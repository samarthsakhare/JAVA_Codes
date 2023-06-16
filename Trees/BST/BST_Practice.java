package Trees.BST;

public class BST_Practice {

    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node n, int key){
        if(n == null){
            return new Node(key);
        }

        if(n.data > key){
            n.left = insert(n.left, key);
        }

        if(n.data < key){
            n.right = insert(n.right, key);
        }

        return n;
    }


    public static void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }


    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(key < root.data){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }


    public static Node delete(Node root, int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node IS = InorderSuccesssor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node InorderSuccesssor(Node root){
        while (root.left != null){
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
//        Node n = null;
//
//        n = insert(n, 5);
//        n = insert(n, 8);
//        n = insert(n, 6);
//        n = insert(n, 2);
//        n = insert(n, 1);
//        n = insert(n, 3);
//        n = insert(n, 4);
//        n = insert(n, 7);
//
//        Inorder(n);
//        System.out.println();
//        delete(n, 6);
//        Inorder(n);

        System.out.println(7/2);

//        System.out.println(search(n, 50));
    }
}
