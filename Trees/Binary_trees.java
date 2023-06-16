package Trees;

import Collection_Frameworks.Array_List;
import Stack.Implementaion_of_stack_using_LL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binary_trees {

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    // creating binary tree
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }


    // preOrder - recursive
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // preOrder iterative
    public static void iPreOrder(Node root){
        if(root == null){
            return;
        }

        Stack<Node> s = new Stack<>();
        s.push(root);

        while (!s.isEmpty()){
            Node temp = s.pop();
            System.out.print(temp.data + " ");

            if(temp.right != null){
                s.push(temp.right);
            }
            if(temp.left != null){
                s.push(temp.left);
            }
        }
    }

    // InOrder - recursive
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // InOrder - iterative
    public static void iInOrder(Node root){
        if(root == null){
            return;
        }

        Stack<Node> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            Node temp = s.pop();

            if(temp.right != null){
                s.push(temp.right);
            }

            System.out.print(temp.data + " ");
             
            if(temp.left != null){
                s.push(temp.left);
            }
        }
    }


    //PostOrder traversal

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    // LevelOrder traversal
    public static void levelOrder(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }


//    public static int count = 0;
//    public static int countNodes(Node root){
//        if(root == null){
//            return 0;
//        }
//        count++;
//        countNodes(root.left);
//        countNodes(root.right);
//
//        return count;
//    }


    // count Nodes
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    // Sum of Nodes
    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }

        sumOfNodes(root.left);
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }


    //Height
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int h;
        if(leftHeight >= rightHeight){
            h = leftHeight;
        }
        else{
            h = rightHeight;
        }

        return h + 1;
    }


    // Diameter :- Number of nodes in the longest path of tree

    // Approach 1 : O(N^2) : In this approach we will calculate height function separately
    public static int D1(Node n){
        if(n == null){
            return 0;
        }
        int d1 = D1(n.left);
        int d2 = D1(n.right);
        int d3 = height(n.left) + height(n.right) + 1;

        return Math.max(d1, Math.max(d2, d3));
    }

    // Approach 2 : O(N) : In this approach we calculate height and diameter in one function

    static class TreeInfo{
        int ht;
        int diam;

        public TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo D2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo l = D2(root.left);
        TreeInfo r = D2(root.right);

        int myh = Math.max(l.ht, r.ht) + 1;

        int diam1 = l.diam;
        int diam2 = r.diam;
        int diam3 = l.ht + r.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);
        return new TreeInfo(myh, myDiam);
    }


    // Sum of Nodes at Kth level
    public static int SumOfKth(Node root, int k){

        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int a = 1;
        int sum = 0;

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode == null){
                a++;
            }

            if(a == k){
                while(!q.isEmpty()){
                    Node s = q.remove();
                    sum = sum + s.data;
                }
                break;
            }

            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

        return sum;
    }


    public static int sumAtLevel(Node n, int k){

        if(k == 1){
            return n.data;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(n);
        q.add(null);

        int sum = 0;
        int c = 1;

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode==null){
                c++;
                if(c==k){
                    while(!q.isEmpty()){
                        Node ne = q.remove();
                        sum += ne.data;
                    }
                    return sum;
                }

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node n = BinaryTree.buildTree(nodes);

//        preOrder(tree.buildTree(nodes));
//        inOrder(tree.buildTree(nodes));
//        postOrder(tree.buildTree(nodes));
//        levelOrder(tree.buildTree(nodes));

//        System.out.println(countNodes(tree.buildTree(nodes)));

//        System.out.println("The sum of the all nodes in tree is "+ sumOfNodes(BinaryTree.buildTree(nodes)));

//        System.out.println("The height of the tree is " + height(tree.buildTree(nodes)));

//        iPreOrder(BinaryTree.buildTree(nodes));
//        iInOrder(BinaryTree.buildTree(nodes));

//        System.out.println("Diameter of tree is "+ D1(n));


//        System.out.println(D2(n).diam);
//        System.out.println(D2(n).ht);

//        System.out.println(SumOfKth(n, 3));
        System.out.println(sumAtLevel(n,3));
    }
}
