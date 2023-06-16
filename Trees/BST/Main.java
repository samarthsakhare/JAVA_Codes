package Trees.BST;
import java.util.ArrayList;

public class Main {


    static class Node{
        int data;
        Binary_Search_Trees.Node left;
        Binary_Search_Trees.Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert
    public static Binary_Search_Trees.Node insert(Binary_Search_Trees.Node node, int val){
        if(node == null){
            node = new Binary_Search_Trees.Node(val);
            return node;
        }

        if(node.data > val){
            node.left = insert(node.left, val);
        }
        else {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public static void print(ArrayList<Integer> p){
        for (int i=0;i<p.size();i++){
            System.out.print(p.get(i)+" ");
        }
        System.out.println();
    }

    public static void rootToLeafPath(Binary_Search_Trees.Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            print(path);
        } else{
            rootToLeafPath(root.left, path);
            rootToLeafPath(root.right, path);
        }
        path.remove(path.size()-1);
    }


    public static void main(String[] args) {

        int nodes[] = {3, 5, 6, 8, 10, 11 ,14};

        Binary_Search_Trees.Node root = null;

        for (int i=0;i < nodes.length-1;i++){
            root = insert(root, nodes[i]);
        }

        rootToLeafPath(root, new ArrayList<>());
    }
}
