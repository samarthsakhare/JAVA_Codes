package Trees.BST;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary_Search_Trees {

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


    // Insert
    public static Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
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


    // Search
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else{
           return search(root.right, key);
        }
    }


    // Display in Inorder
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    // Delete
    public static Node delete(Node root, int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }
        else{ //root.data == key
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3
            Node IS = inorderSucessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSucessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }


    // Search in between Range
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(x<=root.data && y>=root.data){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }
        else if(x>=root.data){
            printInRange(root.right, x, y);
        }
        else{
            printInRange(root.left, x ,y);
        }
    }

    public static void print(ArrayList<Integer> p){
        for (int i=0;i<p.size();i++){
            System.out.print(p.get(i)+" ");
        }
        System.out.println();
    }

    public static void rootToLeafPath(Node root, ArrayList<Integer> path){
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

        Node root = null;

        for (int i=0;i < nodes.length-1;i++){
            root = insert(root, nodes[i]);
        }


//        System.out.println(search(root, 3));

//        inOrder(root);
//        System.out.println();
//        delete(root, 6);
//        inOrder(root);

//        printInRange(root, 3, 6);
//        System.out.println();
//        printInRange(root, 1, 3);

        rootToLeafPath(root, new ArrayList<>());
    }
}
