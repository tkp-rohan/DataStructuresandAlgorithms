package Unit14_Trees;

// Height of a binary tree is maximum number of node from root to its leaf path.
// T.C. = O(n)
// A.S. = O(h)

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class u14p6_heightofbinarytree {
    
    public static int heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }else{
            return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right))+1;
        }
    }

    public static void main(String[] args) {
         Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println("Height of the given Binary Tree is: "+heightOfBinaryTree(root));
    }

}
