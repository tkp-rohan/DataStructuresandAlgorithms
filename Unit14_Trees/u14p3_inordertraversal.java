package unit14_trees;

// T.C. = O(n) (We do constant amount of work for every node.)

// A.S. = O(h). h=height of binary tree

// If we see the recursion calls we can notice this way that when you call for root, it makes a recursive call for the left child and once this recursive call is finished, then only it makes a recursive call for the right child. 

// So either the left child will be there in the recursion call stack or function call stack, or the right child will be there in the function call stack. Suppose right child is there in the function call stack. Again, either the left child of this or right child of this will be there in the function call stack. 

// So at most you have the number of items in the recursion call stack or function call stack, which is proportional to the number of nodes from root to the leaf, which is height of binary tree.

//  So at most you will have number of function calls in the recursion call stack equal to or proportional to height of this binary tree.

// If you want to know the exact how many functions will be there, in the worst case it will be h plus one (h+1).

// considering height as number of nodes on the longest path from root to a leaf.

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class u14p3_inordertraversal {
    
    public static void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.key+" ");
            inorderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        inorderTraversal(root);
    }

}
