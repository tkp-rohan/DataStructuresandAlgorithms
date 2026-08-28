package unit14_trees;


// Size of Binary Tree

class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}


public class u14p10_sizeOfBinaryTree {
    

    public static int getSize(Node root){

        if(root==null){
            return 0;
        }else{
            return 1 + getSize(root.left) + getSize(root.right); 
        }
    }
}
